package models;

public class Book extends Item {

	// attributes
	private int isbn;

	// constructor
	public Book(int id, String name, String publisher, int isbn) {
		super(id, name, publisher);
		this.isbn = isbn;
	}

	// behaviours

	// getters and setters

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
}