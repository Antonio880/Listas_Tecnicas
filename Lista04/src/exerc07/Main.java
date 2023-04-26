package exerc07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado empregado = new Empregado("Antonio", 15000);
		Gerente gerente = new Gerente("Fischer", 20000, "TI");
		Vendedor vendedor = new Vendedor("Ze", 5000, 10);
		
		System.out.println(empregado.ToString());
		System.out.println(gerente.toString());
		System.out.println(vendedor.toString());
		
		
	}

}
