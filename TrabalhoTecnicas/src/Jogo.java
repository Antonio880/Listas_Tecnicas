
public class Jogo {

	private String nomeUser;
	private Plano plano;
	
	public Jogo(String nomeUser, Plano plano) {
		this.nomeUser = nomeUser;
		this.plano = plano;
	}
	
	public void Grade() {
		for (Celula celula : plano.listaCelulas) {
			if(!celula.listaRobos.isEmpty()){
				System.out.print(celula.listaRobos.get(celula.listaRobos.size() - 1).tipo);
				//for(Robo robo : celula.listaRobos) {
					//if(robo instanceof Andador)
						//System.out.print(robo.tipo);
					//if(robo instanceof Peao)
						//System.out.print(robo.tipo);
					//if(robo instanceof Torre)
						//System.out.print(robo.tipo);
					//if(robo instanceof Bispo)
						//System.out.print(robo.tipo);
					//if(robo instanceof Cavalo)
						//System.out.print(robo.tipo);
					//if(robo instanceof Rei)
						//System.out.print(robo.tipo);
					//if(robo instanceof Rainha) 
						//System.out.print(robo.tipo);
					//}
			}else if(celula.modelo != null) {
				if(celula.modelo instanceof Aluno)
					System.out.print(celula.modelo.tipo);
				if(celula.modelo instanceof Bug) 
					System.out.print(celula.modelo.tipo);
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
