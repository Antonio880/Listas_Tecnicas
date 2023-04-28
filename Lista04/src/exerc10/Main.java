package exerc10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Questões 10, 11, 12 estão no mesmo pacote pois se tratavam da mesma classe;
		 */
		
		Empregado empregado = new Empregado("Antonio", 18, "000.000.000-00", 12, 10000, 8);
		Operario operario = new Operario("Ze", 20, "100.000.000-00", 10, 6000, 7, 500, 15);
		Vendedor vendedor = new Vendedor("Josildo", 90, "130.000.000-00", 11, 5000, 6, 400, 13);
		
		
		System.out.println(empregado.calcularSalario());
		System.out.println(empregado.getCpf());
		System.out.println(operario.calcularSalario());
		System.out.println(vendedor.calcularSalario());
	}

}
