package POO;

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.setName("Antonio");
		Tipo tipo = new Tipo();
		
		tipo.name = "POO em Java";
		tipo.description = "Aula sobre POO em java";

		Filme f = new Filme("Jonh Wick", tipo);
		
		Aluguel aluguel = new Aluguel(c, f);
		
		System.out.println(aluguel.client.name);
		System.out.println(aluguel.movie.name);
		System.out.println(aluguel.movie.tipo.name);
	}

}
