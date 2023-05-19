package CalculadoraTestExemplos;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc;

	@Before
	public void setUp() throws Exception {
		calc = new Calculadora();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = ArithmeticException.class)
	public void testDividir() {
		calc.dividir(10, 0);
	}

	@Test
	public void testMsg() {

		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(stream);
		PrintStream originalPrintStream = System.out;
		System.setOut(ps);

		calc.msg();

		System.setOut(originalPrintStream);
		String output = new String(stream.toByteArray());
		assertTrue(output.toString().contains("Calculadora"));
	}

}
