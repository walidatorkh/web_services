package test;

import core.Book;
import core.CD;
import core.Item;
import core.Store;

public class ClientTest {

	public static void main(String[] args) {

		Store store = Store.getInstance();

		store.addItem(new Book("bookA", 1235, "AAA"));
		store.addItem(new Book("bookB", 54, "BBB"));

		store.addItem(new CD("cdA", 125, "band1"));
		store.addItem(new CD("cdB", 258, "band2"));

		// print store content

		Item[] storeItems = store.getAllItems();

		System.out.println("store content");
		for (Item curr : storeItems) {
			if (curr != null) {
				System.out.println(curr);
			}
		}

	}

}
