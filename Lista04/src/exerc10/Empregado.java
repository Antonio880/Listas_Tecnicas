package exerc10;

public class Empregado extends Pessoa{

	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, int idade, String cpf, int codigoSetor, double salarioBase, double imposto) {
		super(nome, idade, cpf);
		this.codigoSetor = codigoSetor;
		this.imposto = imposto;
		this.salarioBase = salarioBase;
		
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Empregado [codigoSetor=" + codigoSetor + ", salarioBase=" + salarioBase + ", imposto=" + imposto + "]";
	}



	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double calcularSalario() {
		if(salarioBase >= 0) { 
			return salarioBase-(salarioBase*(imposto/100));
		}else {
			return 0;
		}
	}

	
}
