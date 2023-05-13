package exerc18;

public class Plano {

	protected int tamanhoX;
	protected int tamanhoY;
	protected Celula areaJogo[][];
	
	
	public Plano(int tamanhoX, int tamanhoY) {
		boolean controle = true;
		do {
			if(tamanhoX == tamanhoY) {
				this.tamanhoX = tamanhoX;
				this.tamanhoY = tamanhoY;
				controle = false;
			}
		}while(controle);
		
		areaJogo = new Celula[tamanhoX][tamanhoY];
		for (int i = 0; i < tamanhoX; i++) {
			for (int j = 0; j < tamanhoY; j++) {
				Celula celula = new Celula(i, j);
				areaJogo[i][j] = celula;
			}
		}
	}
	
	
	public Celula retornarCelula(int x, int y) {
		for (int i = 0; i < tamanhoX; i++) {
			for (int j = 0; j < tamanhoY; j++) {
				if(areaJogo[i][j].posicaoXCelula == x && areaJogo[i][j].posicaoYCelula == y) {
					return areaJogo[i][j];
				}
			}
		}
		return null;
	}
}
