package exerc07;

public class Vendedor extends Empregado{

	private float percentualComissao;
	
	public Vendedor(String nome, float salario, float percentualComissao) {
		super(nome, salario);
		this.percentualComissao = percentualComissao;
		// TODO Auto-generated constructor stub
	}
	
	public float calcularSalario() {
		float aumento = this.getSalario()+(this.getSalario()* (this.percentualComissao/100));
		return (aumento);
	}
	
	public String toString() {
		return "Nome: " + this.getNome()+ " Salario: " + this.getSalario()+ " Percentual de comissao: " + this.percentualComissao+ " Salario com comissao: " + this.calcularSalario();
	}
}
