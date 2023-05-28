
public class Cavalo extends Robo{

	public Cavalo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		tipo = " C ";
		quantidadeMaxima = 2;
	}

	public String verificarRobo() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if(plano.listaCelulas.get(i).listaRobos.get(i) != null && plano.listaCelulas.get(i).listaRobos.get(i) instanceof Cavalo) {
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
						novaPosicaoX = this.posicaoXRobo;
						novaPosicaoY = this.posicaoYRobo;
						for(int j = 1, h = 1; h <= celulasParaAvancar; h++) {
							if(novaPosicaoX <= 1 && novaPosicaoY >= plano.tamanhoYPlano ){
								novaPosicaoX = 1;
								novaPosicaoY = plano.tamanhoYPlano;
							}else if(novaPosicaoY >= plano.tamanhoYPlano) {
								novaPosicaoY = plano.tamanhoYPlano;
							}else {
								novaPosicaoX -= j;
								novaPosicaoY += j;
							}
						}
						novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
					}	
				}
			}
			
			addCelulasAntigas();
			
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
	
	
	public void Retroceder(int celulasParaAvancar) {
		Celula novaCelula = null;
		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		
		for (Celula celula : plano.listaCelulas) {
			for (Robo robo : celula.listaRobos) {
				if(robo == this) {
					novaPosicaoX = this.posicaoXRobo;
					novaPosicaoY = this.posicaoYRobo;
					for(int j = 1, h = 1; h <= celulasParaAvancar; h++) {
						if(novaPosicaoX >= plano.tamanhoXPlano && novaPosicaoY <= 1 ){
							novaPosicaoX = plano.tamanhoXPlano;
							novaPosicaoY = 1;
						}else if(novaPosicaoX >= plano.tamanhoXPlano) {
							novaPosicaoX = plano.tamanhoXPlano;
						}else {
							novaPosicaoX += j;
							novaPosicaoY -= j;
						}
					}
					novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				}	
			}
		}
		
		addCelulasAntigas();
			
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
	
	
	@Override
	public void addCelulasAntigas() {
		Celula antigaCelula = null;
		antigaCelula = plano.retornarCelula(posicaoXRobo, posicaoYRobo);
		this.celulasVisitadas.add(antigaCelula);
	}
}
