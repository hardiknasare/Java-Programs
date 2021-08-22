package tester;

import static com.core.app.BookCategory.valueOf;
import static java.time.LocalDate.parse;
import static utils.IoUtils.restoreData;
import static utils.IoUtils.storeData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.core.app.Book;

import custom_exception.BookHandlingException;

public class LibraryTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name ");
			String filename = sc.nextLine();
			Map<Integer, Book> books = restoreData(filename);

			boolean exit = false;

			while (!exit) {
				System.out.println("1. Display all available books,  " + "2. Issue out book  " + "3. Return book  "
						+ "4. Apply discount on old books  " + "5. Sort the books as per Issue numb  "
						+ "6. Sort the books on publish date & author  " + "100. Exit  ");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Books Details");
						for (Book b1 : books.values()) {
							System.out.println(b1);
						}

						System.out.println("---------------------------------------------------");
						// Java 8 api method
						// Functional programming
						System.out.println("Books Details");
						books.forEach((isbn, bk) -> System.out.println(bk));
						break;

					case 2:
						System.out.println("Enter isbn numb to issue out book");
						int isbn1 = sc.nextInt();
						Book b1 = books.get(isbn1);
						if (b1 == null) {
							throw new BookHandlingException("Book not found");
						}
						System.out.println("Enter quantity to issue out book");
						int quantity1 = sc.nextInt();
						if (b1.getQuantity() < quantity1) {
							throw new BookHandlingException("Insufficient number of books");
						}
						b1.setQuantity(b1.getQuantity() - quantity1);
						System.out.println(b1);
						break;

					case 3:
						System.out.println("Enter isbn numb to return book");
						int isbn2 = sc.nextInt();
						Book b2 = books.get(isbn2);
						if (b2 == null) {
							System.out.println("Book Name, Author, Price, Category, Quantity, Publish Date(yyyy-MM-dd");
							books.put(isbn2, new Book(isbn2, sc.next(), sc.next(), sc.nextDouble(),
									valueOf(sc.next().toUpperCase()), sc.nextInt(), parse(sc.next())));
							System.out.println("Book added: " + books.get(isbn2));
							break;
						}
						System.out.println("Enter quantity to return book");
						int quantity2 = sc.nextInt();
						b2.setQuantity(b2.getQuantity() + quantity2);
						System.out.println(b2);
						break;

					case 4:
						System.out.println("Enter date(yyyy-MM-dd) and discound price");
						LocalDate expDate = parse(sc.next());
						double disAmt = sc.nextDouble();

//						for (Book b3 : books.values()) {
//							if (b3.getPublishDate().isBefore(expDate)) {
//								if (b3.getPrice() <= disAmt)
//									throw new BookHandlingException("Discount is greater than Original price");
//								b3.setPrice(b3.getPrice() - disAmt);
//								System.out.println("Discount Applied on "+b3.getIssueBookNo());
//							}
//						}

						books.forEach((isbn, bk) -> {
							if (bk.getPublishDate().isBefore(expDate))
								try {
									if (bk.getPrice() < disAmt)
										throw new BookHandlingException("Discount is greter than Original price");
									bk.setPrice(bk.getPrice() - disAmt);
								} catch (Exception e) {
									e.printStackTrace();
								}
						});
//						books.forEach((isbn1,b)->{
//							if (b.getPublishDate().isBefore(d1)) {
//								try {
//								if (b.getPrice() - discount < 0)
//									throw new BookExceptionHandling("Discount applied is high");
//								b.setPrice(b.getPrice() - discount);
//								}
//								catch(Exception e){
//									e.printStackTrace();
//								}
//							}});

						break;

					case 5:
						TreeMap<Integer, Book> sortedMap = new TreeMap<>(books);

//						for (Book b4 : sortedMap.values()) 
//							System.out.println(b4);
						sortedMap.forEach((isbn, bk) -> System.out.println(bk));
						break;

					case 6:
						System.out.println("Sorting based on Publish date and author");
						Collection<Book> colBk = books.values();
						ArrayList<Book> bookList = new ArrayList<>(colBk);
//						Collections.sort(bookList , new Comparator<Book>() {
//							public int compare(Book b1, Book b2) {
//								int result = b1.getPublishDate().compareTo(b2.getPublishDate());
//								if (result == 0)
//									result = b1.getAuthor().compareTo(b2.getAuthor());
//								return result;
//							}
//						});
						Comparator<Book> abc = (o1, o2) -> {
							int result = o1.getPublishDate().compareTo(o2.getPublishDate());
							if (result == 0)
								result = o1.getAuthor().compareTo(o2.getAuthor());
							return result;
						};

						Collections.sort(bookList, abc);
						for (Book b : bookList)
							System.out.println(b);

						break;

					case 7:
						break;

					case 100:
						storeData(books, filename);
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
