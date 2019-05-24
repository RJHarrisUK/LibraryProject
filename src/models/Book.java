package models;

import interfaces.Creatable;
import interfaces.Deletable;
import interfaces.Readable;
import interfaces.Updatable;

public class Book extends Item implements Creatable, Readable, Updatable, Deletable {

	// attributes
	private int isbn;

	// constructor
	public Book(int id, String name, String publisher, boolean checkedOut, int isbn) {
		super(id, name, publisher, checkedOut);
		this.isbn = isbn;
	}

	// behaviours
	// change the attribute of the item variable (checkedOut) to false using casting
	public void checkIn() {
		((Item) this).setCheckedOut(false);

	}
	// getters and setters

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public void Create() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Read() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Delete() {
		// TODO Auto-generated method stub

	}
}