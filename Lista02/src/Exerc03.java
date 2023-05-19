import java.util.Random;
import java.util.Scanner;
public class Exerc03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gerador = new Random();
		Scanner ler = new Scanner(System.in);
		int cont, numeroAleatorio, numeroLido;
		boolean teste = true;
		numeroAleatorio = gerador.nextInt(100);
		for(; teste == true;) {
			System.out.println(numeroAleatorio);
			do {
				System.out.println("Digite um numero aleatorio entre 1 e 100");
				numeroLido = ler.nextInt();
				if(numeroLido < numeroAleatorio) {
					System.out.println("Você Errou! o numero a ser adivinhado é maior");
				}else if(numeroLido > numeroAleatorio) {
					System.out.println("Você Errou! o numero a ser adivinhado é menor");
				}else if(numeroLido == numeroAleatorio) {
					teste = false;
					System.out.println("Você Acertou!!!");
				}
				
			}while(teste);
		}
	}

}
