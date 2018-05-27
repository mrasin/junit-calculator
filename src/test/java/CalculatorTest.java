import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		//System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		//System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void test1() throws Exception {
		//System.out.println("Metoda testowa");
		double a = 2.0;
		double b = 3.0;
		double c = 4.5;
		double d = 1.2;

		double suma1 = classUnderTest.sum(a, b);
		double suma2 = classUnderTest.sum(c, d);

		Assert.assertEquals("Bledny wynik sumowania", 5.0, suma1, 0.001);
		Assert.assertEquals("Bledny wynik sumowania", 5.7, suma2, 0.001);
	}

	@Test
	public void testOdejmowania() throws Exception {
		double a = 5.0;
		double b = 3.0;

		double odejmowanie1 = classUnderTest.subtract(a, b);

		Assert.assertEquals("Bledny wynik odejmowania", 2.0, odejmowanie1, 0.001);
	}

	@Test
	public void testMnozenia() throws Exception {
		double a = 3.0;
		double b = 3.5;

		double c = 5.0;
		double d = 0.0;

		double mnozenie1 = classUnderTest.multiply(a, b);
		double mnozenie2 = classUnderTest.multiply(c, d);

		Assert.assertEquals("Bledny wynik mnozenia", 10.5, mnozenie1, 0.001);
		Assert.assertEquals("Bledny wynik mnozenia", 0.0, mnozenie2, 0.001);
	}

	@Test
	public void testDzielenia() throws Exception {
		double a = 6.0;
		double b = 3.0;

		double dzielenie1 = classUnderTest.divide (a, b);
		Assert.assertEquals("Bledny wynik dzielenia", 2.0, dzielenie1, 0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDzieleniaPrzezZero () throws Exception {
		double c = 10.0;
		double d = 0.0;

		double dzielenie2 = classUnderTest.divide (c, d);
	}
}

