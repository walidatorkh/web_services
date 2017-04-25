package core;

import java.util.ArrayList;
import java.util.List;

import core.interfaces.GenericStore;

public class Store implements GenericStore {

	public static final double MAX_PRICE = 200;

	private List<Item> items = new ArrayList<>();

	// 2 create a global store
	private static Store instance = new Store();

	// 1 private CTOR
	private Store() {
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
		
		if(indexOfRequestedItem != -1) {
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

}
