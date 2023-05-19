package robo;

public abstract class Robo {

	public int id;
	public String Nome;
	public int posicaoXRobo;
	public int posicaoYRobo;
	public Plano plano;

	public Robo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		this.id = id;
		this.Nome = nome;
		this.posicaoXRobo = posicaox;
		this.posicaoYRobo = posicaoy;
		this.plano = plano;

		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			aux = plano.listaCelulas.get(i);
			if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
				aux.robo = this;
			}
		}
	}
	
	//Coloco abstrato pois ele sera a classe pai de todos os outros robos que eu for criar
	
}
