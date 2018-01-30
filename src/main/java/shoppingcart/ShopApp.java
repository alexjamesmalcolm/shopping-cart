package shoppingcart;

import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
		Cart myCart = new Cart();

		Scanner input = new Scanner(System.in);
		boolean quit = false;
		while (!quit) {
			myCart.displayCart();
			int choice = mainMenu(input);
			if (choice == 1) {
				askForItem(myCart, input);
			} else if (choice == 2) {
				askRemoveAmount(myCart, input);
			} else if (choice == 3) {
				askRemoveAll(myCart, input);
			} else if (choice == 4) {
				quit = true;
			}
			System.out.println();
		}
		input.close();
	}

	private static void askRemoveAmount(Cart cart, Scanner input) {
		System.out.println("What item would you like to remove?");
		String name = input.nextLine();
		System.out.println("How many would you like to remove?");
		int quantity = input.nextInt();
		cart.remove(name, quantity);
	}

	private static void askRemoveAll(Cart cart, Scanner input) {
		System.out.println("What item would you like to remove?");
		String choice = input.nextLine();
		cart.removeAll(choice);
	}

	private static int mainMenu(Scanner input) {
		System.out.println("1. Add item");
		System.out.println("2. Remove # of item");
		System.out.println("3. Remove all of item");
		System.out.println("4. Checkout");
		int choice = input.nextInt();
		return choice;
	}

	private static void askForItem(Cart cart, Scanner input) {
		String name = askForName(input);
		Double price = askForPrice(input);
		int quantity = askForQuantity(input);
		cart.addItem(new Item(name, price, quantity));
	}

	private static int askForQuantity(Scanner input) {
		System.out.print("Enter the quantity of the item: ");
		int quantity = input.nextInt();
		return quantity;
	}

	private static Double askForPrice(Scanner input) {
		System.out.print("Enter the price per item: ");
		Double price = input.nextDouble();
		return price;
	}

	private static String askForName(Scanner input) {
		System.out.print("Enter the name of the item: ");
		String name = input.next();
		return name;
	}

}
