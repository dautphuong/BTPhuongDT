package assignment_801;

import java.util.Scanner;

public class Song extends Multimedia{
	String singer;

	public Song() {
		super();
	}

	public Song(String name, double duration,String singer) {
		super(name, duration);
		this.singer=singer;
	}
	
	
	
	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Song{name=" + this.getName() + ", duration=" + this.getDuration() + ", singer=" + this.getSinger() + "}";
	}

	public void createSong(Scanner sc) {
		createMultimedia(sc);
		System.out.print("Input name of singer :");
		this.setSinger(sc.next());
	}
}
