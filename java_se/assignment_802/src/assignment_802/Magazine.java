package assignment_802;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Magazine extends Publication {
	String author;
	int volumn;
	int edition;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	@Override
	void display() {
		System.out.println("Magazine{author=" + this.getAuthor() + 
				", volumn=" + this.getVolumn() + 
				", edition=" + this.getEdition() + "}");
	}
	
	public Magazine saveMagazine(Scanner sc) {
		savePublication(sc);
		System.out.print("Input author :");
		this.setAuthor(sc.next());
		System.out.print("Input volumn :");
		this.setVolumn(Integer.parseInt(sc.next()));
		System.out.print("Input edition :");
		this.setEdition(Integer.parseInt(sc.next()));
		return this;
	}
	public static void top10Magazine(List<Magazine> magazines) {
		Collections.sort(magazines, new Comparator<Magazine>() {
			@Override
			public int compare(Magazine o1, Magazine o2) {
				// TODO Auto-generated method stub
				if (o2.getEdition() > o1.getEdition()) {
					return 1;
				}
				else return -1;
			}
		});
		for(int i=0;i<magazines.size();i++) {
			if(i==10)break;
			magazines.get(i).display();
		}
	}
}
