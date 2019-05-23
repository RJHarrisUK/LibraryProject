package models;

import java.util.ArrayList;

public class Library {

	// constructor
	private ArrayList<Item> library = new ArrayList<Item>();

	// behaviours

	// getters and setters
	public void setLibrary(ArrayList<Item> library) {
		this.library = library;
	}

	public ArrayList<Item> getLibrary() {
		return library;
	}

}
