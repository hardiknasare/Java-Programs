package com.core.app;

import java.io.Serializable;
import java.time.LocalDate;


public class Book implements Serializable {
	private int issueBookNo;
	private String name;
	private String author;
	private double price;
	private BookCategory category;
	private int quantity;
	private LocalDate publishDate;
	
	public Book(int issueBookNo, String name, String author, Double price, BookCategory category, int quantity, LocalDate publishDate) {
		this.issueBookNo = issueBookNo;
		this.name = name;
		this.author = author;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.publishDate = publishDate;
	}
	
	@Override
	public String toString() {
		return "Book Issue Number="+issueBookNo+", Name="+name+", Author="+author+", Price="+price+
				", Category="+category+", Quantity="+quantity+", Publish Date=" +publishDate;
	}
	
	public int getIssueBookNo() {
		return issueBookNo;
	}

	public void setIssueBookNo(int issueBookNo) {
		this.issueBookNo = issueBookNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}	
}




//Day 12
//1.Revise class work.
//Extract & import day12.1 in your workspace
//Revise 
//1.1 EmpManagement.java : to go through CRUD operations.
//1.2 Revise all iterator related testers (TestIterator1 to TestIterator6.java)
//1.3 Go through TestSorting1.java , to revise natural ordering
//
//2. Solve
//Create java application for library of books.
//Book : isbn or title(string) , author(string) , price(double), category(enum) , quantity(int) , publish date(Date)
//No validation rules for today.
//Custom exception class : BookHandling exception.
//Create CollectionUtils to add at least 5 book details.(sample data)
//Create a Tester for the following
//Get populated book list from the CollectionUtils
//
//Options
//0. Display all available books using Iterator
//
//1. Issue out book
//i/p isbn & quantity
//o/p error mesg if book is not available or insufficient quantity or success mesg with book quantity updated
//
//2. Return book 
//i/p isbn & quantity 
//Update the quantity if book already exists
//Otherwise ask for complete book details & then add the book.
//
//3. Apply discount on old books (i.e reduce price of books published before specific date)
//i/p date & discount amount
//
//4. Sort the books as per isbn.