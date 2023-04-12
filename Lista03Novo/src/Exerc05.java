import java.util.Scanner;

public class Exerc05 {

	public static int[] copy(int[] vetor1) {
		int[] copy = new int[vetor1.length];
		for(int i = 0; i < vetor1.length; i++) {
			copy[i] = vetor1[i];
		}
		return copy;
	}
	
	public static float[] copy(float[] vetor2) {
		float[] copy = new float[vetor2.length];
		for(int i = 0; i < vetor2.length; i++) {
			copy[i] = vetor2[i];
		}
		return copy;
	}
	
	
	public static void main(String[] args) {
		
		int opcao;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o tipo do seu vetor, 1-Integer, 2-Float");
		opcao = ler.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Digite o tamanho do vetor");
			int tamanho1 = ler.nextInt();
			
			System.out.println("Preencha o primeiro vetor!");
			int[] vetor1 = new int[tamanho1];
			for(int i = 0; i < tamanho1; i++) {
				System.out.println("Digite a posicao: " + (i+1) + "ª");
				vetor1[i] = ler.nextInt();
			}
			int[] copyInt = copy(vetor1);
			System.out.println("A cópia exata do vetor eh: ");
			for (int i = 0; i < copyInt.length; i++) {
			    System.out.print(copyInt[i] + " ");
			}
		break;
		
		case 2:
			System.out.println("Digite o tamanho do vetor");
			int tamanho2 = ler.nextInt();
			
			System.out.println("Preencha o primeiro vetor!");
			float[] vetor2 = new float[tamanho2];
			for(int i = 0; i < tamanho2; i++) {
				System.out.println("Digite a posicao: " + (i+1) + "ª");
				vetor2[i] = ler.nextInt();
			}
			float[] copyFloat = copy(vetor2);
			System.out.println("A cópia exata do vetor eh: ");
			for (int i = 0; i < copyFloat.length; i++) {
			    System.out.print(copyFloat[i] + " ");
			}

		break;
		
		default:
			System.out.println("Opção Inválida");
		}
		ler.close();
		
	}

}
