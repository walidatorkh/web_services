package test;

import core.Book;
import core.CD;
import core.Store;

public class ClientTest {

	public static void main(String[] args) {

		Store store = new Store();

		store.addBook(new Book("bookA", 1235, "AAA"));
		store.addBook(new Book("bookB", 54, "BBB"));

		store.addCd(new CD("cdA", 125, "band1"));
		store.addCd(new CD("cdB", 258, "band2"));

		// print store content

		Book[] storeBooks = store.getAllBooks();

		System.out.println("store content");
		System.out.println("books");
		for (Book book : storeBooks) {
			if (book != null) {
				System.out.println(book);
			}
		}

		CD[] storeCds = store.getAllCds();

		System.out.println("cds");
		for (CD cd : storeCds) {
			if (cd != null) {
				System.out.println(cd);

			}
		}
	}

}
