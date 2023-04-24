package exerc04;

public class Produto {
	private String nome;
	public float preco;
	public int quantidade;
	
	public Produto(String nome, float preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public void comprarProduto(int quantidade) {
		if(quantidade < this.quantidade) {
			this.quantidade -= quantidade;
			double Desconto = (preco*quantidade) * geradorDesconto();
			System.out.println("Foi retirado o produto " + this.nome + " que restou "+ this.quantidade + " e o valor total a ser pago eh " + ((preco*quantidade)-Desconto) + "R$");
			System.out.println("A compra obteve um desconto de " + (Desconto*100) + "%");
		}else {
			System.out.println("Quantidade insuficiente no estoque");
		}
		
	}
	
	public double geradorDesconto() {
		if(this.preco <= 100.00 && this.preco >= 0) {
			return 0;
		}else if(this.preco > 100.00 && this.preco <= 200.00) {
			return 0.1;
		}else if(this.preco > 200.00 && this.preco <= 500.00) {
			return 0.2;
		}else {
			return 0.25;
		}
	}
	
	
}
