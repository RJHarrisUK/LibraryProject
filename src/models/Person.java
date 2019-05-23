package models;

public class Person {

	// attributes
	private String name;
	private int dob;
	private boolean libraryMember;

	// constructor
	public Person(String name, int dob, boolean libraryMember) {
		this.name = name;
		this.dob = dob;
		this.libraryMember = libraryMember;
	}
	// behaviours

	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public boolean isLibraryMember() {
		return libraryMember;
	}

	public void setLibraryMember(boolean libraryMember) {
		this.libraryMember = libraryMember;
	}

}
