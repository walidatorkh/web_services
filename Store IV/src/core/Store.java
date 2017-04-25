package core;

import core.interfaces.GenericStore;

public class Store implements GenericStore {

	private Item[] items = new Item[10];

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
	public void addItem(Item item) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				break;
			}
		}
	}

	@Override
	public void deleteItem(int index) {
		items[index] = null;
	}

	@Override
	public Item getItem(int index) {
		return items[index];
	}

	@Override
	public Item[] getAllItems() {
		return items;
	}

}
