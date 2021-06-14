package assignment_801;

import java.util.List;

public class MultimediaManagement {
	private List<Multimedia> listOfMultimedia;
	
	public MultimediaManagement(List<Multimedia> listOfMultimedia) {
		super();
		this.listOfMultimedia = listOfMultimedia;
	}

	public void addMultiMedia(Multimedia multimedia) {
		listOfMultimedia.add(multimedia);
	}

	public void displayMultiMedia() {
		for (Multimedia multimedia : listOfMultimedia) {
			System.out.println(multimedia);
		}
	}
}
