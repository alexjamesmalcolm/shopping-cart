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
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Item {Name: " + name + ", Price: " + price + ", Quantity: " + quantity + "}";
	}

	public void setQuantity(int newQuantity) {
		quantity = newQuantity;
	}

}
