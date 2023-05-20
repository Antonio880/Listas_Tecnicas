
public class Torre extends Robo{

	public Torre(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		tipo = " T ";
	}

	
	public String verificarRobo() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if(plano.listaCelulas.get(i).listaRobos.get(i) != null && plano.listaCelulas.get(i).listaRobos.get(i) instanceof Andador) {
				return "X : " + plano.listaCelulas.get(i).posicaoXCelula + " Y : " + plano.listaCelulas.get(i).posicaoYCelula; 
			}
		}
		return null;
	}
	
	public void Avancar(int celulasParaAvancar) {
		Celula novaCelula = null;
		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		if(celulasParaAvancar <= 2 && celulasParaAvancar >= 0) {
			for (Celula celula : plano.listaCelulas) {
				for (Robo robo : celula.listaRobos) {
					if(robo == this) {
						novaPosicaoX = this.posicaoXRobo - celulasParaAvancar;
						novaPosicaoY = this.posicaoYRobo;
						if(novaPosicaoX <= 1){
							novaPosicaoX = 1;
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
		}else {
			System.out.println("-----MOVIMENTO INVÁLIDO-----");
		}
	}
	
	
	public void Retroceder(int celulasParaAvancar) {
		Celula novaCelula = null;
		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		if(celulasParaAvancar >= 0 && celulasParaAvancar <= 2) {
			for (Celula celula : plano.listaCelulas) {
				for (Robo robo : celula.listaRobos) {
					if(robo == this) {
						novaPosicaoX = this.posicaoXRobo + celulasParaAvancar;
						novaPosicaoY = this.posicaoYRobo;
						if(novaPosicaoX >= plano.tamanhoXPlano){
							novaPosicaoX = plano.tamanhoXPlano;
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
		}else {
			System.out.println("-----MOVIMENTO INVALIDO-----");
		}
	}
}
