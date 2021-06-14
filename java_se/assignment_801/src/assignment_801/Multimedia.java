package assignment_801;

import java.util.Scanner;

public abstract class Multimedia {
	String name;
	double duration;
	
	
	public Multimedia() {
	}


	public Multimedia(String name, double duration) {
		this.name = name;
		this.duration = duration;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getDuration() {
		return duration;
	}


	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public void createMultimedia(Scanner sc) {
		System.out.print("Input name: ");
		this.setName(sc.next());
		System.out.print("Input duration: ");
		this.setDuration(Double.parseDouble(sc.next()));
	};
}
