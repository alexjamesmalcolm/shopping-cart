package shoppingcart;

import org.junit.Test;
import org.junit.Assert;

public class CartTest {
	
	@Test
	public void shouldHaveAnOrderAdded() {
		Cart underTest = new Cart();
		underTest.addItem(new Item());
		int check = underTest.listSize();
		Assert.assertEquals(1, check);
	}
}