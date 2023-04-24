package exerc03;

public class Fatura {

	public int itemFaturado;
	public String descricao;
	public int quantidadeComprada;
	
	public double precoUnitario;
	public double precoTotal;
	
	public Fatura(int itemFaturado, double precoTotal, String descricao, int quantidadeComprada, double precoUnitario){
		if(quantidadeComprada < 0) {
			this.quantidadeComprada = 0;
		}else {
			this.quantidadeComprada = quantidadeComprada;
		}
		this.itemFaturado = itemFaturado;
		this.precoTotal = precoTotal;
		this.descricao = descricao;
		if(precoUnitario < 0) {
			this.precoUnitario = 0;
		}else {
			this.precoUnitario = precoUnitario;
		}
		
	}

	

	public int getItemFaturado() {
		return itemFaturado;
	}

	public void setItemFaturado(int itemFaturado) {
		this.itemFaturado = itemFaturado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public double getValorFatura() {
		return (this.quantidadeComprada * this.precoUnitario);
	}
	
	public double gerarDesconto(double precoUnitario, float desconto) {
		double total = precoUnitario;
		if(precoUnitario >= 0 && desconto >= 0) {
			total += (precoUnitario * (desconto/100));
		}else {
			total = 0;
		}
		return total;
	}
	
	
}
