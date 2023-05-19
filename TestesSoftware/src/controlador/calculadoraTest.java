package controlador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class calculadoraTest {

	@Before
	public void setUp() {
		System.out.println("Inicio");
	}
	
	@Test
	public void deveriaSomartest() {
		
		calculadora calc = new calculadora();
		assertEquals("O calculo foi errado",2, calc.dividir(6, 2));
	}
	
	@Test (expected = ArithmeticException.class)
	public void divisaoPorZeroTest() {
		calculadora calc = new calculadora();
		assertTrue(calc.dividir(10, 0) == 5);
	}
	
	

}
