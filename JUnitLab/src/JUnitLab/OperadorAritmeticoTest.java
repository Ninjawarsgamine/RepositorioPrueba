package JUnitLab;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class OperadorAritmeticoTest {
	@Test
	public void suma() {

		int esperado = 8;
		int a = 5;
		int b = 3;

		int suma = OperadorAritmetico.suma(a, b);

		assertEquals(esperado, suma);
	}

	@Test
	public void division() {
		int esperado = 2;
		int a = 8;
		int b = 4;
		int division;
		try {
			division = OperadorAritmetico.division(a, b);
			assertEquals(esperado, division);
		} catch (Exception e) {
			fail();
		}
	}

}
