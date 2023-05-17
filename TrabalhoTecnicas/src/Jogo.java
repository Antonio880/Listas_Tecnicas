
public class Jogo {

	private String nomeUser;
	private Plano plano;
	
	public Jogo(String nomeUser, Plano plano) {
		this.nomeUser = nomeUser;
		this.plano = plano;
	}
	
	public void Grade() {
		Celula aux = null;
		for (Celula celula : plano.listaCelulas) {
			if(celula.listaRobos.size() != 0){
				for(Robo robo : celula.listaRobos) {
					if(robo != null && robo instanceof Andador)
						System.out.print(" A ");
					//if(aux.robo != null && aux.robo instanceof Peao)
						//System.out.print(" P ");
					//if(aux.robo != null && aux.robo instanceof Torre)
						//System.out.print(" T ");
					if(robo != null && robo instanceof Bispo)
						System.out.print(" B ");
					//if(aux.robo != null && aux.robo instanceof Cavalo)
						//System.out.print(" C ");
					//if(aux.robo != null && aux.robo instanceof Rei)
						//System.out.print(" R ");
				}
			}else 
				System.out.print(" * ");
			if(celula.posicaoYCelula % plano.tamanhoYPlano == 0) {
				System.out.println();
			}
		}
	}
	
	public void Jogo() {
		Grade();
		System.out.println();
	}
}
