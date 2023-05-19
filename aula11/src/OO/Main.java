package OO;

public class Main {

	public static void main(String[] args) {

		CarrinhoCompras car = new CarrinhoCompras();
		
		car.addProduto(new Pendrive(1, 100, 20));
		car.addProduto(new Caderno(5, 100, 10));
		car.addProduto(new Mouse(3, 5, 10));

		System.out.println("Valor total da nota: "+ car.calcularValorProdutos());
		

	}

}
