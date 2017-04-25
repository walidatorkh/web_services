package core.interfaces;

import core.Item;
import core.StorePriceException;

public interface GenericStore {

	void addItem(Item item) throws StorePriceException;

	void deleteItem(Item item);

	Item getItem(Item item);

	Item[] getAllItems();
}
