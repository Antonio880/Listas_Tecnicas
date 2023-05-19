package locadora;

public class Main {

	public static void main(String[] args) {
	
		Cliente c = new Cliente();
		c.setNome("Joao");
		Tipo tipo = new Tipo();
		tipo.nome="Programacao";
		tipo.descricao="Agora vai";
		
		Filme f  = new Filme("Como programar em Java", tipo);
		
		Aluguel aluguel = new Aluguel(c,f);
		
		System.out.println(aluguel.cliente.getNome());
		System.out.println(aluguel.filme.nome);
		System.out.println(aluguel.filme.tipo.nome);
		
		
	}

}
