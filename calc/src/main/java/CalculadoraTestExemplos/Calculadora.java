package CalculadoraTestExemplos;

public class Calculadora {

	public int somar(int x, int y) {
		return x + y;
	}

	public double dividir(int numerador, int denominador) 
			throws ArithmeticException {

		if (denominador == 0)
			throw new ArithmeticException();
		
		return numerador/denominador;
	}
	
	public void msg() {
		System.out.println("Calculadora");
	}
}
