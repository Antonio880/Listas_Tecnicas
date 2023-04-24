package exerc05;

public class Main {
	public static void main(String[] args) {
		Contato contato = new Contato(5, "Antonio", "antoniocruzgomes880@gmail.com", 93921392);
		
		//contato.setTelefone(92345614);
		System.out.println(contato.getTelefone());
		System.out.println(contato.getEmail());
		
	}
}
