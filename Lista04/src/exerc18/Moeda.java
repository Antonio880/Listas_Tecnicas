package exerc18;
import java.util.Random;
public class Moeda{

	protected int posicaoXMoeda;
	protected int posicaoYMoeda;
	protected Plano plano;
	

	
	public Moeda(String nome, Plano plano) {
		boolean controle = true;
		this.plano = plano;
		Random random = new Random();
		do {
			this.posicaoXMoeda = random.nextInt(plano.tamanhoX);
			this.posicaoYMoeda = random.nextInt(plano.tamanhoY);
			if(this.posicaoXMoeda != (plano.tamanhoX/2) || this.posicaoYMoeda != (plano.tamanhoY/2)) {
				controle = false;
			}
		}while(controle);
		addInPlanMoeda(this.posicaoXMoeda, this.posicaoYMoeda);
		
	}
	
	public void addInPlanMoeda(int x, int y) {
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.areaJogo[i][j].posicaoXCelula == x && plano.areaJogo[i][j].posicaoYCelula == y) {
					plano.areaJogo[i][j].moeda = this;
				}
			}
		}
	}
	
	
}
