package shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public int listSize() {
		return items.size();
	}

}
