package exerc06;

public class IngressoVIP extends Ingresso{

	private int valorAdicional;
	
	
	public IngressoVIP(int valorAdicional, float valor) {
		super(valor);
		this.valorAdicional = valorAdicional;
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "O valor do IngressoVIP eh: " + (getValor() + this.valorAdicional);
	}

	
}
