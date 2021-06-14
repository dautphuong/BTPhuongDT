package assignment_801;


import java.util.ArrayList;
import java.util.Scanner;

public class index {
	
	public static MultimediaManagement arrMultimedia = new MultimediaManagement(new ArrayList<Multimedia>());

	public static void main(String[] args) {
        displayMainMenu();
	}

	private static void displayMainMenu() {
		System.out.println("------------------------------------------------");
        System.out.println("Main menu :");
        System.out.println("1. Add a new Video\n"+
                "2. Add a new Song\n"+
                "3. Show all multimedia\n"+
                "4. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choose: ");
        String choose = scanner.next();
        switch (choose) {
            case "1":
            	System.out.println("---- Enter Video information ----");
				Video video = new Video();
				video.createMultimedia(scanner);
				arrMultimedia.addMultiMedia(video);
				scanner.nextLine();
                displayMainMenu();
            case "2":
            	System.out.println("---- Enter Song information----");
				Song song = new Song();
				song.createSong(scanner);
				arrMultimedia.addMultiMedia(song);
				scanner.nextLine();
                displayMainMenu();
            case "3":
				System.out.println("---- List of Multimedia ----");
				arrMultimedia.displayMultiMedia();
				scanner.nextLine();
                displayMainMenu();
            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("Fail! Please choose again!");
                displayMainMenu();
        }
		
	}
}
