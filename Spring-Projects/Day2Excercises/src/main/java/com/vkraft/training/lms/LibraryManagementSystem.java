package com.vkraft.training.lms;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice ---> ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter title ---> ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author ---> ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN ---> ");
                    String ISBN = scanner.nextLine();
                    library.addBook(new Book(title, author, ISBN));
                    break;

                case 2:
                    System.out.print("Enter ISBN to borrow ---> ");
                    ISBN = scanner.nextLine();
                    Book bookToBorrow = library.findBook(ISBN);
                    if (bookToBorrow != null) {
                        bookToBorrow.borrowBook();
                    }
                    break;

                case 3:
                    System.out.print("Enter ISBN to return ---> ");
                    ISBN = scanner.nextLine();
                    Book bookToReturn = library.findBook(ISBN);
                    if (bookToReturn != null) {
                        bookToReturn.returnBook();
                    }
                    break;

                case 4:
                    library.displayAllBooks();
                    break;

                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
