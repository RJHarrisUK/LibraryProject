package logic;

import models.Book;
import models.Journal;

public class Runner {

	public static void main(String[] args) {

		Book bible = new Book(1, "The Bible", "The Church", 123456);
		Book lotr = new Book(2, "The Lord of The Rings", "Tolkien House", 234567);
		Book dune = new Book(3, "Dune", "Space Publishing", 345678);

		Journal worldtoday = new Journal(1, "The World Today", "Chatham House", 23);

	}

}
