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
	public void shouldGetTotalPrice1787() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("oranges", 0.99, 3));
		underTest.addItem(new Item("water bottles", 1.49, 10));
		double check = underTest.getTotalPrice();
		Assert.assertEquals(17.87, check, 0.001);
	}
	
	@Test
	public void shouldGetTotalPrice10158() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("oranges", 1.29, 2));
		underTest.addItem(new Item("brando", 99, 1));
		double check = underTest.getTotalPrice();
		Assert.assertEquals(101.58, check, 0.001);
	}
	
	@Test
	public void shouldGetTotalQuantityTwo() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("oranges", 0.99, 1));
		underTest.addItem(new Item("water bottles", 1.49, 1));
		int check = underTest.getTotalQuantity();
		Assert.assertEquals(2, check);
	}
	
	@Test
	public void shouldGetTotalQuantityThree() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("oranges", 0.99, 2));
		underTest.addItem(new Item("water bottles", 1.49, 1));
		int check = underTest.getTotalQuantity();
		Assert.assertEquals(3, check);
	}
	
//	@Test
//	public void shouldGetRemoveItem() {
//		Cart underTest = new Cart();
//		underTest.addItem(new Item("oranges", 0.99, 3));
//		underTest.addItem(new Item("water bottles", 1.49, 10));
//	}
}