

public class Aluno extends Modelo{

	public Aluno(String nome, Plano plano) {
		super(nome, plano);
		tipo = " ∆ ";
	}
	
	/*public void addInPlanMoeda(int x, int y) {
		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			aux = plano.listaCelulas.get(i);
			if (aux.posicaoXCelula == x && aux.posicaoYCelula == y) {
				plano.listaCelulas.add(aux);
			}
		}
	}*/
}
