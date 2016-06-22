import static org.junit.Assert.*;

import org.junit.Test;

import NumberUility.NumberUtility;

public class NumberUtilityTest {

	@Test
	public void formatAsPercentageTest() {
		assertTrue(NumberUtility.formatAsPercentage(100).equals("100.0%"));
	}
	@Test
	public void formatInCcurrencyTest() {
		assertTrue(NumberUtility.formatInCcurrency(100).equals("$100.00"));
	}
	@Test
	public void formatwithDecimalPlacesTest() {
		assertTrue(NumberUtility.formatwithDecimalPlaces(100.334,2).equals("100.33"));
	}
	@Test
	public void maxTest() {
		assertTrue(NumberUtility.max(100, 200) == 200);
	}
	@Test
	public void minTest() {
		assertTrue(NumberUtility.min(100, 200) == 100);
	}

}
