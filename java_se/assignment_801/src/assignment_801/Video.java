package assignment_801;

import java.util.Scanner;

public class Video extends Multimedia{
	public Video() {
		super();
	}

	public Video(String name, double duration) {
		super(name, duration);
	}

	public void createVideo(Scanner sc) {
		createMultimedia(sc);
	}

	@Override
	public String toString() {
		return "Video {name=" + this.getName() + ", duration=" + this.getDuration() + "}";
	}
}
