package JUnitLab;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class SubscripcionTest {

	@Test
	public void testprecioPorMes() throws ParseException {
		double esperado = 100;
		Subscripcion s = new Subscripcion(200, 2);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
		/* Con "assertEquals" consigue el resultado de la comparación. */
	}

	@Test
	public void testprecioPorMes2() throws ParseException {
		double esperado = 67.7;
		Subscripcion s = new Subscripcion(200, 3);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}

}
