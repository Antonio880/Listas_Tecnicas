package exerc15;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Informe o preço de custo do produto: ");
        double precoCusto = sc.nextDouble();
        System.out.print("Informe o preço de venda do produto: ");
        double precoVenda = sc.nextDouble();
        System.out.print("Informe as despesas da empresa: ");
        double despesas = sc.nextDouble();

        Produto produto = new Produto(nome, precoCusto, precoVenda, despesas);
        double margemLucro = produto.calcularMargemLucro();
        System.out.printf("A margem de lucro do produto %s é de %.2f%%\n", nome, margemLucro);
	}

}
