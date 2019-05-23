package models;

public class Journal extends Item {

	// attributes
	private int articles;

	// constructor
	public Journal(int id, String name, String publisher, int articles) {
		super(id, name, publisher);
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
}