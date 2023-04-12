import java.util.Arrays;
import java.util.Scanner;

public class Exerc13 {

	public static int[] searchForOccurrences(int[] vetor1, int[] vetor2) {			
		int EqualAmounts = 0;
		
		for (int i = 0; i < vetor1.length; i++) {
			for (int j = 0; j < vetor2.length; j++) {
				if (vetor1[i] == vetor2[j]) {
					EqualAmounts++;
				}
			}
		}
		
		int ResultIndex = 0;
		
		int[] result = new int[EqualAmounts];
		
		for (int i = 0; i < vetor1.length; i++) {
			for (int j = 0; j < vetor2.length; j++) {
				if (vetor1[i] == vetor2[j]) {
					result[ResultIndex] = vetor1[i];
					
					ResultIndex++;
				}
			}
		}
		
		return result;
	}

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Enter first vector size");
		int tamanho1 = ler.nextInt();
		
		System.out.println("Fill in the first vector");
		int[] vetor1 = new int[tamanho1];
		for(int i = 0; i < tamanho1; i++) {
			System.out.println("Enter the position: " + (i+1) + "ª");
			vetor1[i] = ler.nextInt();
		}
		
		System.out.println("Enter second vector size");
		int tamanho2 = ler.nextInt();
		
		System.out.println("Fill in the second vector");
		int[] vetor2 = new int[tamanho2];
		for(int i = 0; i < tamanho2; i++) {
			System.out.println("Enter the position: " + (i+1) + "ª");
			vetor2[i] = ler.nextInt();
		}
		
		int[] vectorResult = searchForOccurrences(vetor1, vetor2);
		
		System.out.println("this vector Result is " + Arrays.toString(vectorResult));
		
		

	}

}
