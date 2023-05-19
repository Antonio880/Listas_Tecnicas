import java.util.Scanner;
public class Exerc10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 6");
		int num = input.nextInt();
		switch(num) {
		case 1 :
			System.out.println("Digite o tamanho da forma!");
			int tamanhoForma1 = input.nextInt();
			for(int linha = 0; linha <= tamanhoForma1; linha++) {
				for(int coluna = 0; coluna < linha; coluna++) {
					System.out.print(coluna + " ");
				}
				System.out.println();
			}
		break;
		
		case 2:
			boolean controle = false;
			int tamanhoForma2;
			do {
				System.out.println("Digite o tamanho da forma!");
				tamanhoForma2 = input.nextInt();
				if(tamanhoForma2 % 2 == 1) {
					controle = true;
				}
			}while(!controle);
			for(int i = 0; i < tamanhoForma2; i++) {
				for(int j = 0; j < tamanhoForma2; j++) {
					if((j+i) % 2 == 0) {
						System.out.print("@ ");
					}else {
						System.out.print("* ");
					}
					
				}
				System.out.println();
			}
		break;
		
		case 3:
			
		break;
		}
	}

}
