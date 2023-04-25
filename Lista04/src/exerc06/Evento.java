package exerc06;

public class Evento{

	private Ingresso lista;
	private int quantidade;
	
	public Evento(Ingresso lista) {
		this.lista = lista;
	}
	
	public String vendaIngressos(int quantidade) {
		if(this.lista.quantidade > quantidade) {
			return "O valor do ingresso esta por: " + lista.getValor()+ " E a quantidade que restou foi: " + (this.lista.quantidade = lista.getQuantidade() - quantidade);
		}else if(this.lista.quantidade == quantidade) {
			return "O valor do ingresso esta por: " + lista.getValor() + " E os ingressos se esgotaram";
		}else {
			return "Não temos Ingressos suficientes";
		}
	}
	
	public String ingressosRestantes() {
		return "A quantidade de ingressos restantes eh :" + this.lista.quantidade;
	}
}
