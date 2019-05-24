package models;

import java.io.IOException;
import java.nio.CharBuffer;

import interfaces.Creatable;
import interfaces.Deletable;
import interfaces.Updatable;

public class GovDocument extends Item implements Creatable, Readable, Updatable, Deletable {

	// attributes
	private String syClassification;

	// constructor
	public GovDocument(int id, String name, String publisher, boolean checkedOut, String syClassification) {
		super(id, name, publisher, checkedOut);
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