package exerc07;

public class Gerente extends Empregado{
	
	private String departamento;
	
	public Gerente(String nome, float salario, String departamento) {
		super(nome, salario);
		this.departamento = departamento;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public String toString() {
		return "" + departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
