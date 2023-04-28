package exerc10;

public class Vendedor extends Empregado{

	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, int idade, String cpf, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
		super(nome, idade, cpf, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double calcularSalario() {
		if(this.getSalarioBase() >= 0) { 
			return this.getSalarioBase()-(this.getSalarioBase()*(this.getImposto()/100)+(valorVendas*(comissao/100)));
		}else {
			return 0;
		}
	}
}
