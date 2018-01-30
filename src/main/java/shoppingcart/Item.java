package shoppingcart;

public class Item {

	private String name;
	private double price;
	private int quantity;

	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Item() {
		name = "";
		price = 0;
		quantity = 0;
	}

	public String getName() {
		return "";
	}

	public double getPrice() {
		return 0;
	}

	public int getQuantity() {
		return quantity;
	}

}
