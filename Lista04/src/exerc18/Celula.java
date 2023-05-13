package exerc18;

public class Celula {

	protected int posicaoXCelula;
	protected int posicaoYCelula;
	public Robo robo;
	public Moeda moeda;
	public CaractereEspecial caractere;
	
	public Celula(int x, int y) {
		posicaoXCelula = x;
		posicaoYCelula = y;
		robo = null;
		moeda = null;
		caractere = null;
	}
}
