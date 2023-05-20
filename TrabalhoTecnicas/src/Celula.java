import java.util.ArrayList;

public class Celula {

	public int posicaoXCelula;
	public int posicaoYCelula;
	public int id;
	public ArrayList<Robo> listaRobos;
	public Modelo modelo;
	
	public Celula(int id, int x, int y) {
		posicaoXCelula = x;
		posicaoYCelula = y;
		this.id = id;
		modelo = null;
		listaRobos = new ArrayList<Robo>();
	}
	
	public String imprimir() {
		return "Celula: " + id + " x: " + posicaoXCelula + " y: " + posicaoYCelula;
	}
	
}
