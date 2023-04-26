package exerc09;

public class Main {

	public static void main(String[] args) {
		Forma forma = new Forma(5, 10);
		Circulo circulo = new Circulo(5, 10);
		Retangulo retangulo = new Retangulo(5, 10);
		Quadrado quadrado = new Quadrado(10, 15);
		Triangulo triangulo = new Triangulo(20, 15);
	
		
		System.out.println(circulo.calcularAreaCirculo());
		System.out.println(retangulo.calcularArea());
		System.out.println(quadrado.calcularArea());
		System.out.println(triangulo.calcularAreaTriangulo());
	}
}
