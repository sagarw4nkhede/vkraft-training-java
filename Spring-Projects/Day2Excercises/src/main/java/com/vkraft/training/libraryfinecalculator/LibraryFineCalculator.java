package com.vkraft.training.libraryfinecalculator;

import java.util.Scanner;

class Book {
	private String title;
	private int overdueDays;

	public Book(String title, int overdueDays) {
		this.title = title;
		this.overdueDays = overdueDays;
	}

	public String getTitle() {
		return title;
	}

	public int getOverdueDays() {
		return overdueDays;
	}

	public double calculateFine() {
		double fine = 0;
		for (int i = 1; i <= overdueDays; i++) {
			if (i <= 7) {
				fine += 1; // $1/day for the first 7 days
			} else {
				fine += 2; // $2/day afterward
			}
		}
		return fine;
	}
}

public class LibraryFineCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of books: ");
		int numberOfBooks = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		Book[] books = new Book[numberOfBooks];

		for (int i = 0; i < numberOfBooks; i++) {
			System.out.println("\nEnter details for book " + (i + 1) + ":");
			System.out.print("Title: ");
			String title = scanner.nextLine();
			System.out.print("Overdue days: ");
			int overdueDays = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			books[i] = new Book(title, overdueDays);
		}

		System.out.println("\nCalculating fines...");
		double totalFine = 0;
		for (Book book : books) {
			double fine = book.calculateFine();
			totalFine += fine;
			System.out.println(book.getTitle() + " - Overdue: " + book.getOverdueDays() + " days, Fine: $" + fine);
		}

		System.out.println("\nTotal fine for all books: $" + totalFine);
		System.out.println("Thank you for using the Library Fine Calculator!");
	}
}
