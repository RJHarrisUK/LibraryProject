package models;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;

import interfaces.Creatable;
import interfaces.Deletable;
import interfaces.Updatable;

public class Library implements Creatable, Readable, Updatable, Deletable {

	// constructor
	private ArrayList<Item> libraryList = new ArrayList<Item>();

	// behaviours
	public void getCheckInState() {
		int numberBooks = 0;
		int numberJournals = 0;
		int numberGovDocs = 0;
		int totalItems = 0;

		for (Item i : libraryList) {
			if (i instanceof Book && i.isCheckedOut() == true) {
				numberBooks++;
				totalItems++;
			}
			if (i instanceof Journal && i.isCheckedOut() == true) {
				numberJournals++;
				totalItems++;
			}
			if (i instanceof GovDocument && i.isCheckedOut() == true) {
				numberGovDocs++;
				totalItems++;
			}
		}
		System.out.println("The library currently has " + totalItems + " item(s) checked out");
		System.out.println(numberBooks + " Books");
		System.out.println(numberJournals + " Journals");
		System.out.println(numberGovDocs + " Government Documents");
	}

	// getters and setters
	public void setLibraryList(ArrayList<Item> libraryList) {
		this.libraryList = libraryList;
	}

	public ArrayList<Item> getLibraryList() {
		return libraryList;
	}

	@Override
	public void Delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub

	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void Create() {
		// TODO Auto-generated method stub

	}

}
