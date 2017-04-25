package test;

import core.Book;
import core.CD;
import core.Item;
import core.Store;
import core.StorePriceException;

public class ClientTest {

	public static void main(String[] args) {

		Store store = Store.getInstance();
		store.loadItemsFromFile();
		// we don't have to handle unchecked exceptions...
		store.addItem(new Book("bookA", 198, "AAA"));
		store.addItem(new Book("bookB", 54, "BBB"));

		// ... but we can
		try {
			store.addItem(new CD("cdA", 188, "band1"));
			store.addItem(new CD("cdB", 125, "band2"));
			
		} catch (StorePriceException e) {
			e.printStackTrace();
		}

		// print store content


		System.out.println("store content");
		for (Item curr : store.getAllItems()) {
			if (curr != null) {
				System.out.println(curr);
			}
		}
		
		Book bookToDelete = new Book();
		bookToDelete.setTitle("bookB");
		store.deleteItem(bookToDelete);
		
		System.out.println("\nstore content after deleting " + bookToDelete);
		for (Item curr : store.getAllItems()) {
			if (curr != null) {
				System.out.println(curr);
			}
		}
		
		store.storeItemsToFile();

	}

}
