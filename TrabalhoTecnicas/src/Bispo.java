
public class Bispo extends Robo{

	public Bispo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		tipo = " B ";
	}

	public String verificarRobo() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if(plano.listaCelulas.get(i).listaRobos.get(i) != null && plano.listaCelulas.get(i).listaRobos.get(i) instanceof Bispo) {
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
							if(novaPosicaoY <= 1 ){
								novaPosicaoY = 1;
							}else if(novaPosicaoY <=1 && novaPosicaoX <=1) {
								novaPosicaoX = 1;
								novaPosicaoY = 1;
							}else {
								novaPosicaoX -= j;
								novaPosicaoY -= j;
							}
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
	
	
	public void Retroceder(int celulasParaAvancar) {
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
							if(novaPosicaoX >= plano.tamanhoXPlano ){
								novaPosicaoX = plano.tamanhoXPlano;
							}else if(novaPosicaoY >= plano.tamanhoYPlano && novaPosicaoX >= plano.tamanhoXPlano) {
								novaPosicaoX = plano.tamanhoXPlano;
								novaPosicaoY = plano.tamanhoYPlano;
							}else {
								novaPosicaoX += j;
								novaPosicaoY += j;
							}
						}
						novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
					}	
				}
			}
			for(Celula celula : plano.listaCelulas) {
				if((posicaoXRobo == celula.posicaoXCelula && posicaoYRobo == celula.posicaoYCelula) && celula.listaRobos.contains(this)) {
					celula.listaRobos.remove(this);
				}
				if (novaCelula.posicaoXCelula == celula.posicaoXCelula && novaCelula.posicaoYCelula == celula.posicaoYCelula) {
					this.posicaoXRobo = novaPosicaoX;
					this.posicaoYRobo = novaPosicaoY;
					celula.listaRobos.add(this);
				}
				
			}
		}else {
			System.out.println("-----MOVIMENTO INVALIDO-----");
		}
	}
	@Override
	public void addPontos() {
		// TODO Auto-generated method stub
		this.pontos += 10;
	}
}
