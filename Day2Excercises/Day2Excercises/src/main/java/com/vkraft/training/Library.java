package com.vkraft.training;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;

	public Library() {
		books = new ArrayList<>();
	}

	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added to the library ---> " + book.getISBN());
	}

	public void removeBook(String ISBN) {
		for (Book book : books) {
			if (book.getISBN().equals(ISBN)) {
				books.remove(book);
				System.out.println("Book removed from the library ---> " + ISBN);
				return ;
			}
		}
		System.out.println("Book not found in the library ---> " + ISBN);
	}

	public Book findBook(String ISBN) {
		for (Book book : books) {
			if (book.getISBN().equals(ISBN)) {
				return book;
			}
		}
		System.out.println("Book not found in the library ---> " + ISBN);
		return null;
	}

	public void displayAllBooks() {
		if (books.isEmpty()) {
			System.out.println("No books available in the library.");
		} else {
			System.out.println("------------------------Books available in the library------------------------");
			for (Book book : books) {
				book.displayDetails();
				System.out.println("---------------------------------------------------------------");
			}
		}
	}
}
