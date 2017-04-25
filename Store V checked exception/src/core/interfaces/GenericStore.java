package core.interfaces;

import core.Item;
import core.StorePriceException;

public interface GenericStore {

	void addItem(Item item) throws StorePriceException;

	void deleteItem(int index);

	Item getItem(int index);

	Item[] getAllItems();
}
