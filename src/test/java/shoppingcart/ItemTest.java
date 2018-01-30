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
}