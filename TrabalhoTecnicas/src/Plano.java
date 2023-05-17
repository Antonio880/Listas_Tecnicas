import java.util.ArrayList;
public class Plano {

	public ArrayList<Celula> listaCelulas;
	public int tamanhoXPlano;
	public int tamanhoYPlano;
	
	public Plano(int tamanhoX, int tamanhoY) {
		listaCelulas = new ArrayList<Celula>();
		
		int cont = 1;
		for (int i = 1; i <= tamanhoX; i++) {
			for (int j = 1; j <= tamanhoY; j++) {
				Celula celula = new Celula(cont, i, j);
				listaCelulas.add(celula);
				cont++;
			}
		}
		this.tamanhoXPlano = tamanhoX;
		this.tamanhoYPlano = tamanhoY;
	}
	
	
	public Celula retornarCelula(int x, int y) {
		for (int i = 0; i < listaCelulas.size(); i++) {
			if(listaCelulas.get(i).posicaoXCelula == x && listaCelulas.get(i).posicaoYCelula == y) {
				return listaCelulas.get(i);
			}
		}
		return null;
	}
	
	public void retornarCelulas() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			System.out.println(listaCelulas.get(i).imprimir());
		}
	}
	
	
	
}
	

