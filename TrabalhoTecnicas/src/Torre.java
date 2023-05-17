
public class Torre extends Robo{

	public Torre(int id, String nome, int posicaox, int posicaoy, Plano plano) {
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
					
					int novaPosicaoX = plano.listaCelulas.get(i).posicaoXCelula - celulasParaAvancar;
					int novaPosicaoY = plano.listaCelulas.get(i).posicaoYCelula;
					Celula novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
					
					if (novaCelula != null) {
						this.posicaoXRobo = novaPosicaoX;
						this.posicaoYRobo = novaPosicaoY;
						novaCelula.robo = this;
					}
				}
			}
		}else {
			System.out.println("A torre so pode avancar no maximo 2 casas!");
		}
	}
	
	
	public void Retroceder(int celulasParaAvancar) {
		if(celulasParaAvancar <= 2 && celulasParaAvancar > 0) {
			for (int i = 0; i < plano.listaCelulas.size(); i++) {
				if(plano.listaCelulas.get(i).robo == this) {
					plano.listaCelulas.get(i).robo = null;
					
					int novaPosicaoX = plano.listaCelulas.get(i).posicaoXCelula + celulasParaAvancar;
					int novaPosicaoY = plano.listaCelulas.get(i).posicaoYCelula;
					Celula novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
					if (novaCelula != null) {
						this.posicaoXRobo = novaPosicaoX;
				        this.posicaoYRobo = novaPosicaoY;
				        novaCelula.robo = this;
				    }
				}
			}
		}else {
			System.out.println("A torre so pode retroceder no maximo 2 casas!");
		}
	}
}
