package logic;

import models.Book;
import models.GovDocument;
import models.Journal;
import models.Library;

public class Runner {

	public static void main(String[] args) {

		Book bible = new Book(1, "The Bible", "The Church", true, 123456);
		Book lotr = new Book(2, "The Lord of The Rings", "Tolkien House", false, 234567);
		Book dune = new Book(3, "Dune", "Space Publishing", false, 345678);

		Journal worldtoday = new Journal(1, "The World Today", "Chatham House", false, 23);
		Journal foreignaffairs = new Journal(2, "Foreign Affairs", "IR Press", true, 41);

		GovDocument whitepaper1 = new GovDocument(1, "White Paper One", "HMG", false, "Official");
		GovDocument whitepaper2 = new GovDocument(2, "White Paper Two", "HMG", true, "Official Sensitive");

		Library libraryManager = new Library();
		libraryManager.getLibraryList().add(bible);
		libraryManager.getLibraryList().add(lotr);
		libraryManager.getLibraryList().add(dune);
		libraryManager.getLibraryList().add(worldtoday);
		libraryManager.getLibraryList().add(foreignaffairs);
		libraryManager.getLibraryList().add(whitepaper1);
		libraryManager.getLibraryList().add(whitepaper2);
		libraryManager.getCheckInState();

		bible.checkIn();
		libraryManager.getCheckInState();
	}

}
