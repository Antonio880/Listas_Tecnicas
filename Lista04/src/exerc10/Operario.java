package exerc10;

public class Operario extends Empregado{

	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, int idade, String cpf, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
		super(nome, idade, cpf, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		// TODO Auto-generated constructor stub
	}

	public double calcularSalario() {
		if(this.getSalarioBase() >= 0) { 
			return this.getSalarioBase()-(this.getSalarioBase()*(this.getImposto()/100)+(valorProducao*(comissao/100)));
		}else {
			return 0;
		}
	}
}
