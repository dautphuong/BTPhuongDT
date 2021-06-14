package assignment_802;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Book extends Publication{
	String isbn;
	Set<String> author;
	String publicationPlace;
	
	
	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public Set<String> getAuthor() {
		return author;
	}


	public void setAuthor(Set<String> author) {
		this.author = author;
	}


	public String getPublicationPlace() {
		return publicationPlace;
	}


	public void setPublicationPlace(String publicationPlace) {
		this.publicationPlace = publicationPlace;
	}


	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Book{isbn=" + this.getIsbn() +
				", author=" + this.getAuthor() + 
				", publicationPlace=" + this.getPublicationPlace() + "}");
	}
	
	public Book saveBook(Scanner sc) {
		savePublication(sc);
		System.out.print("Input isbn :");
		this.setIsbn(sc.next());
		Set<String> setAuthors = new HashSet<String>();
        String choose;
		do {
			System.out.print("Input author :");
			setAuthors.add(sc.next());
			System.out.print("Add other author[y/n]: ");
			choose = sc.next();			
		} while (!"n".equals(choose) );
		this.setAuthor(setAuthors);
		System.out.print("Input publicationPlace :");
		this.setPublicationPlace(sc.next());
		return this;
	}
	
	public void addAuthor(String author) {
		if (this.getAuthor().contains(author)) {
			System.out.println("Author existed");
			return;
		}
		this.author.add(author);
		System.out.println("Add successfully");
	}
	
	public static void search(List<Book> books) {
		System.out.println("------------------------------------------------");
    	System.out.println("-- 1. Search book by isbn");
		System.out.println("-- 2. Search book by author");
		System.out.println("-- 3. Search book by publisher");
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter choose: ");
	    String choose = scanner.next();
	}
}
