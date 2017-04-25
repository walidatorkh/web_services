package core.interfaces;

import core.Item;

public interface GenericStore {

	void addItem(Item item);

	void deleteItem(int index);

	Item getItem(int index);

	Item[] getAllItems();
}
