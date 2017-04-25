package core;

public class Store {

	private Item[] items = new Item[10];

	public void addItem(Item item) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				break;
			}
		}
	}

	public void deleteItem(int index) {
		items[index] = null;
	}

	public Item getItem(int index) {
		return items[index];
	}

	public Item[] getAllItems() {
		return items;
	}

}
