package shoppingcart;

import org.junit.Test;
import org.junit.Assert;

public class ItemTest {

	@Test
	public void shouldGetName() {
		Item underTest = new Item();
		String check = underTest.getName();
		Assert.assertEquals("", check);
	}

	@Test
	public void shouldGetPrice() {
		Item underTest = new Item();
		double check = underTest.getPrice();
		Assert.assertEquals(0.0, check, 0.001);
	}

	@Test
	public void shouldGetQuantity() {
		Item underTest = new Item();
		int check = underTest.getQuantity();
		Assert.assertEquals(0, check);
	}

	@Test
	public void shouldHaveCustomName() {
		String inputName = "oranges";
		double inputPrice = 0.99;
		int inputQuantity = 3;
		Item underTest = new Item(inputName, inputPrice, inputQuantity);
		String name = underTest.getName();
		Assert.assertEquals(inputName, name);
	}

	@Test
	public void shouldHaveCustomPrice() {
		String inputName = "oranges";
		double inputPrice = 0.99;
		int inputQuantity = 3;
		Item underTest = new Item(inputName, inputPrice, inputQuantity);
		double price = underTest.getPrice();
		Assert.assertEquals(inputPrice, price, 0.001);
	}

	@Test
	public void shouldHaveCustomQuantity() {
		String inputName = "oranges";
		double inputPrice = 0.99;
		int inputQuantity = 3;
		Item underTest = new Item(inputName, inputPrice, inputQuantity);
		int quantity = underTest.getQuantity();
		Assert.assertEquals(inputQuantity, quantity);
	}
}