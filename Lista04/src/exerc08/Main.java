package exerc08;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaCorrente corrente = new ContaCorrente("Antonio", 5, 10000);
		ContaEspecial especial = new ContaEspecial("Ze", 2, 12000, 2000);
		
		System.out.println(corrente.fazerSaque(5000));
		System.out.println(corrente.fazerSaque(12000));
		System.out.println(especial.fazerSaque(12000));
		System.out.println(especial.fazerSaque(13000));
	}

}
