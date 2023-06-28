package model;

public class Robo {

	private int posicaoXRobo;
	private int posicaoYRobo;
	public String tipo;
	public int pontuacao;
	
	public Robo() {
		
	}

	public void encontrouAluno() {
		this.pontuacao += 15;
	}
	
	public void encontrouBug() {
		this.pontuacao -= 10;
	}
}
