package exerc09;
import java.lang.Math;

public class Circulo extends Forma{

	public Circulo(int lados, int altura) {
		super(lados, altura);
		// TODO Auto-generated constructor stub
	}
	
	public double calcularAreaCirculo() {
		return 2*Math.PI*(altura/2);
	}

}
