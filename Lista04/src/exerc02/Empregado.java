package exerc02;

public class Empregado {

	private String firstName;
	private String lastName;
	private float salarioMensal;
	
	public Empregado(String firstName, String lastName, float salarioMensal){
		this.firstName = firstName;
		this.lastName = lastName;
		this.salarioMensal = salarioMensal;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(float salarioMensal) {
		if(salarioMensal < 0) {
			this.salarioMensal = 0;
		}else {
		this.salarioMensal = salarioMensal;
		}
	}
	
	public void ImprimirSalarioAnual() {
		System.out.println(this.salarioMensal * 12); 
	}
	
}
