package shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

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

	public void removeAll(String name) {
		items.removeIf((Item item) -> item.getName().equals(name));
	}

	public void remove(String name, int quantityForRemoval) {
		items.replaceAll((item) -> {
			if (item.getName().equals(name)) {
				double price = item.getPrice();
				int quantity = item.getQuantity();
				return new Item(name, price, quantity - quantityForRemoval);
			} else {
				return item;
			}
		});
	}

	public void displayCart() {
		if (items.size() > 0) {
			System.out.println("Current Cart");
			items.forEach((item) -> {
				System.out.println(item);
			});
			System.out.println("Total Price: " + getTotalPrice());
		} else {
			System.out.println("Current Cart is Empty");
		}
	}
}
