package models;

import java.io.IOException;
import java.nio.CharBuffer;

import interfaces.Creatable;
import interfaces.Deletable;
import interfaces.Updatable;

public class Person implements Creatable, Readable, Updatable, Deletable {

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
