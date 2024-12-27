package com.vkraft.training.lms;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private boolean isAvailable;

	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.isAvailable = true;
	}

	public boolean borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("Book borrowed successfully ---> " + title);
			return true;
		} else {
			System.out.println("Book is currently unavailable ---> " + title);
			return false;
		}
	}

	public void returnBook() {
		if (!isAvailable) {
			isAvailable = true;
			System.out.println("Book returned successfully ---> " + title);
		} else {
			System.out.println("Book was not borrowed ---> " + title);
		}
	}

	public void displayDetails() {
		System.out.println("Title ---> " + title);
		System.out.println("Author ---> " + author);
		System.out.println("ISBN ---> " + ISBN);
		System.out.println("Availability ---> " + (isAvailable ? "Available" : "Not Available"));
	}

	public String getISBN() {
		return ISBN;
	}
}
