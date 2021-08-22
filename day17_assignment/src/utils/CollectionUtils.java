package utils;

import static com.core.app.BookCategory.FICTION;
import static com.core.app.BookCategory.SCRIPTURE;
import static com.core.app.BookCategory.SELF_HELP;
import static java.time.LocalDate.parse;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.core.app.Book;

//(int issueBookNo, String name, String author, Double price, BookCategory category, int quantity, Date publishDate) {

public interface CollectionUtils {
	
	static Map<Integer, Book> populateBooks() {
		Map<Integer, Book> map = new HashMap<>();
		
		map.put(110, (new Book(110, "The Alchemist", "Paulo Coelho", 250.0, FICTION, 10, parse("1988-01-01"))));
		map.put(120, (new Book(120, "Secret", "Rhonda Byrne", 400.0, SELF_HELP, 15, parse("2006-11-26"))));
		map.put(100, (new Book(100, "Goals", "Brian Tracy", 200.0, SELF_HELP, 5, parse("2000-01-01"))));
		map.put(150, (new Book(150, "Bhagavad Geeta", "Vyasa", 500.0, SCRIPTURE, 10, parse("0000-01-01"))));
		map.put(102, (new Book(102, "Bible", "Paul the Apostle", 500.0, SCRIPTURE, 10, parse("0000-01-01"))));
		return map;
	}

//	public static ArrayList<Book> populate() throws ParseException {
//		ArrayList<Book> list = new ArrayList<>();
//		list.add(new Book(110, "The Alchemist", "Paulo Coelho", 250.0, FICTION, 10, ("1-1-1988")));
//		list.add(new Book(120, "Secret", "Rhonda Byrne", 400.0, SELF_HELP, 15, sdf.parse("26-11-2006")));
//		list.add(new Book(100, "Goals", "Brian Tracy", 200.0, SELF_HELP, 5, sdf.parse("1-1-2000")));
//		list.add(new Book(150, "Bhagavad Geeta", "Vyasa", 500.0, SCRIPTURE, 10, sdf.parse("1-1-0000")));
//		list.add(new Book(102, "Bible", "Paul the Apostle", 500.0, SCRIPTURE, 10, sdf.parse("1-1-0000")));
//		return list;
//
//	}
}
