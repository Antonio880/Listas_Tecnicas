import java.util.Scanner;

public class Exerc09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int tam = input.nextInt();
		System.out.println("Preencha o vetor");
		String[] vetor1 = new String[tam];
		for(int i = 0; i < tam; i++) {
			System.out.println("Posicao: " + i);
			vetor1[i] = input.next();
		}
		for(int i = 0; i < tam; i++)
			for(int j = 0; j < tam; j++)
				for(int k = 0; k < tam; k++) {
					if(vetor1[i] == vetor1[j] || vetor1[j] == vetor1[k] || vetor1[k] == vetor1[i]) {
						
					}else {
					System.out.println("'" + vetor1[i] + vetor1[j] + vetor1[k] + "'");
					}
				}

	}
}
