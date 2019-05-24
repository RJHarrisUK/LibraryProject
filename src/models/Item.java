package models;

public abstract class Item {

	// attributes
	private int id;
	private String name;
	private String publisher;
	private boolean checkedOut;

	// constructor
	public Item(int id, String name, String publisher, boolean checkedOut) {
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.checkedOut = checkedOut;
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

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	public boolean getCheckedkOut() {
		return checkedOut;
	}
}
