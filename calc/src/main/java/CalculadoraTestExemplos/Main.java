package CalculadoraTestExemplos;

public class Main {
	public static void main(String[] args) {

//		Calculadora calc= new Calculadora();
//		calc.dividir(10, 0);
		 CalculadoraEspecial calc = new CalculadoraEspecial();
		 int vetPrincipal[] = new int[10];
		 int vetSecundario[] = new int[10];
		 calc.menu(vetPrincipal, vetSecundario);

	}
}
