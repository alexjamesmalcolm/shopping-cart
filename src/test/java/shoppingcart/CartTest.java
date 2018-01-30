package shoppingcart;

import org.junit.Test;
import org.junit.Assert;

public class CartTest {

	@Test
	public void shouldHaveAnOrderAdded() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("oranges", 0.99, 3));
		int check = underTest.listSize();
		Assert.assertEquals(1, check);
	}

	@Test
	public void shouldHaveTwoOrdersAdded() {
		Cart underTest = new Cart();
		underTest.addItem(new Item());
		underTest.addItem(new Item());
		int check = underTest.listSize();
		Assert.assertEquals(2, check);
	}

	@Test
	public void shouldGetTotalPrice() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("oranges", 0.99, 3));
		underTest.addItem(new Item("water bottles", 1.49, 10));
		double check = underTest.getTotalPrice();
		Assert.assertEquals(17.87, check, 0.001);
	}
}