package exerc06;

public class Ingresso {

	private float valor;
	public int quantidade;
	
	public Ingresso(float valor, int quantidade){
		this.valor = valor; 
		this.quantidade = quantidade;
	}
	
	public Ingresso(float valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "O valor do ingresso eh: " + this.valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int Quantidade) {
		this.quantidade = Quantidade;
	}
	
}
