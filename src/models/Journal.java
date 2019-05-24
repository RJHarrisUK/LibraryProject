package models;

import java.io.IOException;
import java.nio.CharBuffer;

import interfaces.Creatable;
import interfaces.Deletable;
import interfaces.Updatable;

public class Journal extends Item implements Creatable, Readable, Updatable, Deletable {

	// attributes
	private int articles;

	// constructor
	public Journal(int id, String name, String publisher, boolean checkedOut, int articles) {
		super(id, name, publisher, checkedOut);
		this.articles = articles;
	}

	// behaviours

	// getters and setters

	public int getArticles() {
		return articles;
	}

	public void setArticles(int articles) {
		this.articles = articles;
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
	public int read(CharBuffer arg0) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void Create() {
		// TODO Auto-generated method stub

	}
}