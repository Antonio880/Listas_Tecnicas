import java.util.Random;

public abstract class Modelo {
	
	public String nome;
	public int posicaoXModelo;
	public int posicaoYModelo;
	public Plano plano;
	public String tipo;
	public Random random;

	public Modelo(String nome, Plano plano) {
		random = new Random();
		this.nome = nome;
		boolean controle;
		this.plano = plano;
		
		do {
			controle = verificarLugar();
		}while(controle);
		
		do{
			if(posicaoXModelo >= 0 && posicaoXModelo <= plano.tamanhoXPlano && posicaoYModelo >= 0 && posicaoYModelo <= plano.tamanhoYPlano) {
				Celula aux = null;
				for (int i = 0; i < plano.listaCelulas.size(); i++) {
					aux = plano.listaCelulas.get(i);
					if (aux.posicaoXCelula == posicaoXModelo && aux.posicaoYCelula == posicaoYModelo) {
						aux.modelo = this;
					}
				}
				controle = false;
			}else {
				controle = true;
			}
		}while(controle);
	}
	
	public boolean verificarLugar() {
		this.posicaoXModelo = random.nextInt(plano.tamanhoXPlano);
		this.posicaoYModelo = random.nextInt(plano.tamanhoYPlano);
		for(Celula celula : plano.listaCelulas) {
			if(celula.posicaoXCelula == posicaoXModelo && celula.posicaoYCelula == posicaoYModelo && celula.listaRobos.isEmpty() == true && celula.modelo == null) {
				return false;
			}
		}
		return true;
	}
}
