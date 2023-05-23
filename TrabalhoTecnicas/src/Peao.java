
public class Peao extends Robo{

	public Peao(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		tipo = " P ";
		quantidadeMaxima = 1;
	}

	public String verificarRobo() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if(plano.listaCelulas.get(i).listaRobos.get(i) != null && plano.listaCelulas.get(i).listaRobos.get(i) instanceof Andador) {
				return "X : " + plano.listaCelulas.get(i).posicaoXCelula + " Y : " + plano.listaCelulas.get(i).posicaoYCelula; 
			}
		}
		return null;
	}
	
	public void Avancar() {
		Celula novaCelula = null;
		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		for (Celula celula : plano.listaCelulas) {
			for (Robo robo : celula.listaRobos) {
				if(robo == this) {
					novaPosicaoX = this.posicaoXRobo;
					novaPosicaoY = this.posicaoYRobo - 1;
					if(novaPosicaoY <= 1){
						novaPosicaoY = 1;
					}
					novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				}	
			}
		}
		for(Celula celula : plano.listaCelulas) {
			if (novaCelula.posicaoXCelula == celula.posicaoXCelula && novaCelula.posicaoYCelula == celula.posicaoYCelula) {
				this.posicaoXRobo = novaPosicaoX;
				this.posicaoYRobo = novaPosicaoY;
				celula.listaRobos.add(this);
			}else {
				celula.listaRobos.remove(this);
			}
		}
	}
	
	public void Retroceder() {
		Celula novaCelula = null;
		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		for (Celula celula : plano.listaCelulas) {
			for (Robo robo : celula.listaRobos) {
				if(robo == this) {
					novaPosicaoX = this.posicaoXRobo;
					novaPosicaoY = this.posicaoYRobo + 1;
					if(novaPosicaoY >= plano.tamanhoYPlano){
						novaPosicaoY = plano.tamanhoYPlano;
					}
					novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				}	
			}
		}
		for(Celula celula : plano.listaCelulas) {
			if (novaCelula.posicaoXCelula == celula.posicaoXCelula && novaCelula.posicaoYCelula == celula.posicaoYCelula) {
				this.posicaoXRobo = novaPosicaoX;
				this.posicaoYRobo = novaPosicaoY;
				celula.listaRobos.add(this);
			}else {
				celula.listaRobos.remove(this);
			}
		}
	}
}
