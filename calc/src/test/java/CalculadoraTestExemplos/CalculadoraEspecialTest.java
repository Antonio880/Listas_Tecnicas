package CalculadoraTestExemplos;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraEspecialTest {

	@Test
	public void elementoEstaNoVetor() {
		CalculadoraEspecial calc = new CalculadoraEspecial();
		
		int vet[] = {1,2,3,4,5,6,7,8,9,10};
		
		assertTrue(calc.pesquisar(vet, 9) == 8);
	}
	
	@Test
	public void elementoNaoEstaNoVetor() {
		CalculadoraEspecial calc = new CalculadoraEspecial();
		
		int vet[] = {1,2,3,4,5,6,7,8,9,10};
		
		assertTrue(calc.pesquisar(vet, 11) == -100);
	}
	@Test 
	public void pesquisaPorIndice1() {
		CalculadoraEspecial calc = new CalculadoraEspecial();
		
		int vet[] = {3,12,34,24,5,1};
		
		assertTrue(calc.pesquisarPorIndice(vet, 3) == 24);
	}
	@Test
	public void pesquisaPorIndice2() {
		CalculadoraEspecial calc = new CalculadoraEspecial();
		
		int vet[] = {3,12,34,24,5,1};
		
		assertTrue(calc.pesquisarPorIndice(vet, 6) == 5);
	}

}
