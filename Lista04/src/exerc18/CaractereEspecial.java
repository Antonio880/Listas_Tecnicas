package exerc18;

public class CaractereEspecial {

	public Plano plano;
	
	public CaractereEspecial(Plano plano) {
		this.plano = plano;
	}
	
	public CaractereEspecial addInPlanCaractere(int x, int y) {
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.areaJogo[i][j].posicaoXCelula == x && plano.areaJogo[i][j].posicaoYCelula == y) {
					return plano.areaJogo[i][j].caractere;
				}
			}
		}
		return null;
	}
}
