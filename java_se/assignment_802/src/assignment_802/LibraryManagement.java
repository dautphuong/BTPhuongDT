package assignment_802;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagement {
	public static List<Publication> publications = new ArrayList<Publication>();
	public static List<Book> books = new ArrayList<Book>();
	public static List<Magazine> magazines = new ArrayList<Magazine>();

	public static void main(String[] args) {
		displayMainMenu();
	}

	private static void displayMainMenu() {
		System.out.println("------------------------------------------------");
		System.out.println("LIBRARY MANAGEMENT SYSTEM :");
		System.out.println("1. Add a book\n" + "2. Add a magazine\n" + "3. Display book and magazine\n"
				+ "4. Add author to book\n" + "5. Display top 10 of magazines by volume\n"
				+ "6. Search book by (ibsn,author,publisher)\n" + "7. Exit");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter choose: ");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			Book book = new Book();
			book = book.saveBook(scanner);
			publications.add(book);
			books.add(book);
			scanner.nextLine();
			displayMainMenu();
		case "2":
			Magazine magazine = new Magazine();
			magazine = magazine.saveMagazine(scanner);
			publications.add(magazine);
			magazines.add(magazine);
			scanner.nextLine();
			displayMainMenu();
		case "3":
			for (Publication publication : publications) {
				publication.display();
			}
			scanner.nextLine();
			displayMainMenu();
		case "4":
			for (int i = 0; i < books.size(); i++) {
				System.out.println(i + ". ");
				books.get(i).display();
			}
			System.out.print("Select book:");
			int index = Integer.parseInt(scanner.next());
			System.out.print("Input author:");
			String author = scanner.next();
			books.get(index).addAuthor(author);
			scanner.nextLine();
			displayMainMenu();
		case "5":
			Magazine.top10Magazine(magazines);
			scanner.nextLine();
			displayMainMenu();
		case "6":
			searchBook();
			displayMainMenu();
		case "7":
			System.exit(0);
			break;
		default:
			System.out.println("Fail! Please choose again!");
			displayMainMenu();
		}
	}

	private static void searchBook() {
		System.out.println("------------------------------------------------");
		System.out.println("1. Search book by isbn\n" + "2. Search book by author\n" + "3. Search book by publisher\n"
				+ "4. Back to menu");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter choose: ");
		String choose = scanner.next();
		switch (choose) {
		case "1":
			System.out.print("Input isbn need to search: ");
			String isbn=scanner.next();
			for (Book book : books) {
				if (isbn.equals(book.getIsbn())) {
					book.display();
				}
			}
			scanner.nextLine();
			break;
		case "2":
			System.out.print("Input author need to search: ");
			String author=scanner.next();
			for (Book book : books) {
				if (author.equals(book.getAuthor())) {
					book.display();
				}
			}
			scanner.nextLine();
			break;
		case "3":
			System.out.print("Input publisher need to search: ");
			String publisher=scanner.next();
			for (Book book : books) {
				if (publisher.equals(book.getAuthor())) {
					book.display();
				}
			}
			scanner.nextLine();
			break;
		case "4":
			displayMainMenu();
			break;
		default:
			System.out.println("Fail! Please choose again!");
			searchBook();
		}
	}
}
