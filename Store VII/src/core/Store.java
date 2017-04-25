package core;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import core.interfaces.GenericStore;

public class Store implements GenericStore {

	private File parent = new File("files");
	private File itemsFile = new File(parent, "items");
	public static final double MAX_PRICE = 200;

	private List<Item> items = new ArrayList<>();

	// 2 create a global store
	private static Store instance = new Store();

	// 1 private CTOR
	private Store() {

		// make sure we have the directory to write the items file
		if (!parent.exists()) {
			parent.mkdirs();
		}

		if (!itemsFile.exists()) {
			try {
				itemsFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// 3. static method to get the single global instance
	public static Store getInstance() {
		return instance;
	}

	@Override
	public void addItem(Item item) throws StorePriceException {

		// throw an exception if item is too expensive
		if (item.getPrice() > MAX_PRICE) {
			throw new StorePriceException("this item is too expensive to be added");
		}

		items.add(item);

	}

	@Override
	public void deleteItem(Item item) {
		items.remove(item);
	}

	@Override
	public Item getItem(Item item) {

		int indexOfRequestedItem = items.indexOf(item);

		if (indexOfRequestedItem != -1) {
			return items.get(indexOfRequestedItem);
		}

		return null;
	}

	@Override
	public Item[] getAllItems() {

		// create an array of items of the appropriate size
		Item[] itemsArr = new Item[items.size()];

		// put all items in the array and return it
		return items.toArray(itemsArr);
	}

	public void storeItemsToFile() {

		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(itemsFile)));) {

			out.writeObject(items);
			System.out.println("items storred to file");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void loadItemsFromFile() {

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(itemsFile)));) {
			List<Item> list = (List<Item>) in.readObject();
			items.addAll(list);
			System.out.println("items loaded from file");
		} catch (EOFException e) {
			System.out.println("items file empty");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
