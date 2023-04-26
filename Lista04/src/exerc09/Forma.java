package exerc09;

public class Forma {

	protected int lados;
	protected int altura;

	public Forma(int lados, int altura) {
		super();
		this.lados = lados;
		this.altura = altura;
	}

	public int calcularArea() {
		return lados*altura;
	}
	
	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}
	
	
}
