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

	public double getTotalPrice() {
		return items.stream().mapToDouble((Item item) -> item.getPrice() * item.getQuantity()).sum();
	}

	public int getTotalQuantity() {
		return items.stream().mapToInt((Item item) -> item.getQuantity()).sum();
	}

}
