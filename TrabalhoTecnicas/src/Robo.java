
public abstract class Robo {

	public int id;
	public String nome;
	public int posicaoXRobo;
	public int posicaoYRobo;
	public Plano plano;

	public Robo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		this.id = id;
		this.nome = nome;
		this.posicaoXRobo = posicaox;
		this.posicaoYRobo = posicaoy;
		this.plano = plano;

		boolean controle;
		
		do{
			if(posicaox >= 0 && posicaox <= plano.tamanhoXPlano && posicaoy >= 0 && posicaoy <= plano.tamanhoYPlano) {
				Celula aux = null;
				for (int i = 0; i < plano.listaCelulas.size(); i++) {
					aux = plano.listaCelulas.get(i);
					if (aux.posicaoXCelula == posicaox && aux.posicaoYCelula == posicaoy) {
						aux.listaRobos.add(this);
					}
				}
				controle = false;
			}else {
				controle = true;
			}
		}while(controle);
	}
	public abstract String verificarRobo();
	
	public void Avancar() {};
	
	public void Retroceder() {};
	
	//Coloco abstrato pois ele sera a classe pai de todos os outros robos que eu for criar
	
}