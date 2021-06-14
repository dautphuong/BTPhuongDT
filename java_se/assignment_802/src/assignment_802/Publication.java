package assignment_802;

import java.util.Date;
import java.util.Scanner;

public abstract class Publication {
	int publicationYear;
	String publisher;
	String publicationDate;
	
	
	public Publication() {
	}
	abstract void display();
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	public void savePublication(Scanner sc) {
		System.out.print("Input publicationYear: ");
		this.setPublicationYear(Integer.parseInt(sc.next()));
		System.out.print("Input publisher: ");
		this.setPublisher(sc.next());
		System.out.print("Input publicationDate: ");
		this.setPublicationDate(sc.next());
	}
}
