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
}