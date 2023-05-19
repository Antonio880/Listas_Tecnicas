import java.util.Scanner;
public class Exerc04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero entre 0 e 10!");
		int num = ler.nextInt();
		if(num >= 0 && num <= 10) {
			for(int cont = 0; cont <= 10; cont++) {
				int multi = cont*num;
				System.out.println(num + " x " + cont + " = " + multi);
			}
		}else {
			System.out.println("O numero inserido nao eh valido");
		}
	}

}
