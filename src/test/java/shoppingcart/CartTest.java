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
}