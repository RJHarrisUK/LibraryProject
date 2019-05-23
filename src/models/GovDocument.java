package models;

public class GovDocument extends Item {

	// attributes
	private String syClassification;

	// constructor
	public GovDocument(int id, String name, String publisher, String syClassification) {
		super(id, name, publisher);
		this.syClassification = syClassification;
	}

	// behaviours

	// getters and setters

	public String getSyClassification() {
		return syClassification;
	}

	public void setClassification(String syClassification) {
		this.syClassification = syClassification;
	}
}