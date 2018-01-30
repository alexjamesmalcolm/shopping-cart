package shoppingcart;

import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
		Cart myCart = new Cart();

		Scanner input = new Scanner(System.in);
		boolean quit = false;
		while (!quit) {
			askForItem(myCart, input);
			System.out.println();
			myCart.displayCart();
			quit = askIfQuit(input);
		}
		input.close();
	}

	private static boolean askIfQuit(Scanner input) {
		boolean quit;
		System.out.println("Continue shopping (y/n)?");
		quit = input.next().equals("y");
		return quit;
	}

	private static void askForItem(Cart myCart, Scanner input) {
		String name = askForName(input);
		Double price = askForPrice(input);
		int quantity = askForQuantity(input);
		myCart.addItem(new Item(name, price, quantity));
	}

	private static int askForQuantity(Scanner input) {
		System.out.print("Enter the quantity of the item: ");
		int quantity = input.nextInt();
		return quantity;
	}

	private static Double askForPrice(Scanner input) {
		System.out.print("Enter the price of the item: ");
		Double price = input.nextDouble();
		return price;
	}

	private static String askForName(Scanner input) {
		System.out.print("Enter the name of the item: ");
		String name = input.next();
		return name;
	}

}
