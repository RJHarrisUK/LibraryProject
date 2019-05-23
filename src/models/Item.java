package models;

public abstract class Item {

	// attributes
	private int id;
	private String name;
	private String publisher;

	// constructor
	public Item(int id, String name, String publisher) {
		this.id = id;
		this.name = name;
		this.publisher = publisher;
	}
	// behaviours

	// getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
