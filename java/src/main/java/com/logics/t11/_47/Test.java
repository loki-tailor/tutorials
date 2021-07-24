package com.logics.t11._47;

class Book {
	private String name;
	private String author;

	Book() {}

	Book(String name, String author) {
		name = name;
		author = author;
	}

	String getName() {
		return name;
	}

	String getAuthor() { return author; }
}

public class Test {
	public static void main(String[] args) {

		// private Book book = new Book("Head First Java", "kathy sierra"); // error: illegal start of expression: only final modifier is allowed inside methods

		Book book = new Book("lokeshwar", "tailor");

		System.out.println(book.getName()); // prints null
		System.out.println(book.getAuthor()); // prints null
	}
}