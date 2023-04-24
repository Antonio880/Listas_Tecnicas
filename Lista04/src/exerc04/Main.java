package exerc04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto leite = new Produto("Leite", 5, 15);
		Produto cafe = new Produto("Cafe", 8, 20);
		
		leite.comprarProduto(5);
		cafe.comprarProduto(7);
	}

}
