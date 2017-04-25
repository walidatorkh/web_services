package core;

import core.interfaces.GenericStore;

public class Store implements GenericStore {

	private Item[] items = new Item[10];

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
