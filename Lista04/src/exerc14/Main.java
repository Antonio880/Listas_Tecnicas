package exerc14;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa AlbertEinstein = new Pessoa(0, 14, 3, 1879, "Albert Einstein");
		Pessoa IsaacNewton = new Pessoa(0, 4, 1, 1643, "Isaac Newton");
		
		AlbertEinstein.calculaIdade();
		IsaacNewton.calculaIdade();
		
		System.out.println(AlbertEinstein.getIdade());
		System.out.println(IsaacNewton.getIdade());
	}

}
