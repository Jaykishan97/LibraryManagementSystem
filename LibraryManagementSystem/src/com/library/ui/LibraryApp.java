package com.library.ui;

import java.util.Scanner;

import com.library.Book;
import com.library.Library;

public class LibraryApp {

	private static final Scanner scanner = new Scanner(System.in);
	private static final Library library = new Library();

	public static void main(String[] args) {

		int choice = -1;

		while (choice != 4) {
			System.out.println("Welcome to the Library Management System");
			System.out.println("========================================");
			System.out.println("1. Add a book");
			System.out.println("2. Remove a book");
			System.out.println("3. List all books");
			System.out.println("4. Exit");
			System.out.println("Enter your choice (1-4):");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				addBook();
				break;
			case 2:
				removeBook();
				break;
			case 3:
				listBooks();
				break;
			case 4:
				System.out.println("Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}

			System.out.println();
		}

		scanner.close();
	}

	private static void addBook() {
		System.out.println("Enter book title:");
		String title = scanner.nextLine();

		System.out.println("Enter book author:");
		String author = scanner.nextLine();

		System.out.println("Enter book publication year:");
		int year = scanner.nextInt();
		scanner.nextLine();

		Book book = new Book(title, author, year);
		library.addBook(book);

		System.out.println("Book added successfully!");
	}

	private static void removeBook() {
		System.out.println("Enter book title:");
		String title = scanner.nextLine();

		System.out.println("Enter book author:");
		String author = scanner.nextLine();

		System.out.println("Enter book publication year:");
		int year = scanner.nextInt();
		scanner.nextLine();

		Book book = new Book(title, author, year);
		library.removeBook(book);

		System.out.println("Book removed successfully!");
	}

	private static void listBooks() {
		System.out.println("All books in the library:");
		for (Book book : library.listBooks()) {
			System.out.println(book);
		}
	}
}
