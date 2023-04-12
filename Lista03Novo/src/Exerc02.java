
import java.util.Scanner;

public class Exerc02 {

	public static int mediaVetores(int[] vetor1, int[] vetor2) {
		int soma1 = somaVetor(vetor1);
		int soma2 = somaVetor(vetor2);
		int media = (soma1 + soma2)/2;
		
		return media;
	}
	public static int somaVetor(int[] vetor) {
	    int soma = 0;
	    for (int i = 0; i < vetor.length; i++) {
	        soma += vetor[i];
	    }
	    return soma;
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o tamanho do Primeiro vetor");
		int tamanhoVetor1 = ler.nextInt();
		int[] vetor1 = new int[tamanhoVetor1];
		
		System.out.println("Digite o tamanho do Segundo vetor");
		int tamanhoVetor2 = ler.nextInt();
		int[] vetor2 = new int[tamanhoVetor2];
		
;		System.out.println("Preencha o Primeiro vetor");
		for(int i = 0; i < tamanhoVetor1; i++) {
			if(i == 0) {
			System.out.println("Posicao:" + i + "ª");
			vetor1[i] = ler.nextInt();
			}else {
			System.out.println("Posicao:" + i + "º");
			vetor1[i] = ler.nextInt();
			}
		}
		System.out.println("Preencha o Segundo vetor");
		for(int i = 0; i < tamanhoVetor2; i++) {
			if(i == 0) {
			System.out.println("Posicao:" + i + "ª");
			vetor2[i] = ler.nextInt();
			}else {
			System.out.println("Posicao:" + i + "º");
			vetor2[i] = ler.nextInt();
			}
		}
		
		int media = mediaVetores(vetor1, vetor2);
		System.out.println("A Media dos elementos dos dois vetores eh: " + media);
		ler.close();
	}

}
