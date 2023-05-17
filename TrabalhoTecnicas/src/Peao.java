
public class Peao extends Robo{

	public Peao(int id, String nome, int posicaox, int posicaoy, Plano plano) {
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
	
	public void Avancar() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if(plano.listaCelulas.get(i).robo == this) {
				plano.listaCelulas.get(i).robo = null;
				
				int novaPosicaoX = plano.listaCelulas.get(i).posicaoXCelula;
				int novaPosicaoY = plano.listaCelulas.get(i).posicaoYCelula - 1;
				Celula novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				
				if (novaCelula != null) {
					this.posicaoXRobo = novaPosicaoX;
					this.posicaoYRobo = novaPosicaoY;
					novaCelula.robo = this;
				}
			}
		}
	}
	
	public void Retroceder() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if(plano.listaCelulas.get(i).robo == this) {
				plano.listaCelulas.get(i).robo = null;
				
				int novaPosicaoX = plano.listaCelulas.get(i).posicaoXCelula;
				int novaPosicaoY = plano.listaCelulas.get(i).posicaoYCelula + 1;
				Celula novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				if (novaCelula != null) {
					this.posicaoXRobo = novaPosicaoX;
			        this.posicaoYRobo = novaPosicaoY;
			        novaCelula.robo = this;
			    }
			}
		}
	}
	
}
