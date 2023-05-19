import java.util.Scanner;
public class Exerc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, cont=0;
		Scanner ler = new Scanner(System.in);
		boolean teste = true;
		while(teste) {
			System.out.println("Digite o número");
			cont = ler.nextInt();
			if(cont < 0) {
				teste = false;
				System.out.println(num);
			}
			num = num + cont;
			
		}
	}

}
