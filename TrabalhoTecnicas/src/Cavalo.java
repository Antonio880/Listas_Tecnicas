
public class Cavalo extends Robo{

	public Cavalo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		// TODO Auto-generated constructor stub
	}

	public String verificarRobo() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if(plano.listaCelulas.get(i).robo != null) {
				return "X : " + plano.listaCelulas.get(i).posicaoXCelula + " Y : " + plano.listaCelulas.get(i).posicaoYCelula; 
			}
		}
		return null;
	}
	
	public void Avancar(int celulasParaAvancar) {
		if(celulasParaAvancar <= 2 && celulasParaAvancar > 0) {
			for (int i = 0; i < plano.listaCelulas.size(); i++) {
				if(plano.listaCelulas.get(i).robo == this) {
					plano.listaCelulas.get(i).robo = null;
					
					//int novaPosicaoX = plano.listaCelulas.get(i).posicaoXCelula - celulasParaAvancar;
					int novaPosicaoX = plano.listaCelulas.get(i).posicaoXCelula;
					int novaPosicaoY = plano.listaCelulas.get(i).posicaoYCelula;

					for(int j = 1, h = 1; h <= celulasParaAvancar; h++) {
						novaPosicaoX -= j;
						novaPosicaoY += j;
					}
					Celula novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
					
					if (novaCelula != null) {
						this.posicaoXRobo = novaPosicaoX;
						this.posicaoYRobo = novaPosicaoY;
						novaCelula.robo = this;
					}
				}
			}
		}else {
			System.out.println("O Cavalo so pode avancar no maximo 2 casas!");
		}
	}
	
	
	public void Retroceder(int celulasParaAvancar) {
		if(celulasParaAvancar <= 2 && celulasParaAvancar > 0) {
			for (int i = 0; i < plano.listaCelulas.size(); i++) {
				if(plano.listaCelulas.get(i).robo == this) {
					plano.listaCelulas.get(i).robo = null;
					
					int novaPosicaoX = plano.listaCelulas.get(i).posicaoXCelula;
					int novaPosicaoY = plano.listaCelulas.get(i).posicaoYCelula;
					
					for(int j = 1, h = 1; h <= celulasParaAvancar; h++) {
						novaPosicaoX += j;
						novaPosicaoY -= j;
					}
					
					Celula novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
					if (novaCelula != null) {
						this.posicaoXRobo = novaPosicaoX;
				        this.posicaoYRobo = novaPosicaoY;
				        novaCelula.robo = this;
				    }
				}
			}
		}else {
			System.out.println("O Cavalo so pode retroceder no maximo 2 casas!");
		}
	}
}
