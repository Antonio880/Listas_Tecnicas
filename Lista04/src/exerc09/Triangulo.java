package exerc09;

public class Triangulo extends Forma{

	public Triangulo(int lados, int altura) {
		super(lados, altura);
		// TODO Auto-generated constructor stub
	}
	
	public double calcularAreaTriangulo() {
		return lados*(altura/2);
	}

}
