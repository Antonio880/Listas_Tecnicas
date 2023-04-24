package exerc02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado empregado1 = new Empregado("Antonio", "Cruz", 5000);
		Empregado empregado2 = new Empregado("Lucca", "Gomes", 6000);
		
		empregado1.ImprimirSalarioAnual();
		empregado2.ImprimirSalarioAnual();
		
		empregado1.setSalarioMensal(5500);
		empregado2.setSalarioMensal(6600);
		
		empregado1.ImprimirSalarioAnual();
		empregado2.ImprimirSalarioAnual();
	}

}
