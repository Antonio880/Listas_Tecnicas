import java.util.Scanner;
import java.util.Arrays;

public class Exerc06 {

	public static void trocaValores(int[] valores, int x, int y) {
		int auxiliar = valores[x];
		valores[x] = valores[y];
		valores[y] = auxiliar;
		
	}
	
	public static int[] CloneVector(int[] vetor){
		int [] cloneVector = new int[vetor.length];
		for(int i = 0; i < vetor.length; i++) {
			cloneVector[i] = vetor[i];
		}
		return cloneVector;
	}
	
	public static int[] bubbleSort(int [] valores) {
		
		int cloneVector[] = CloneVector(valores);
		
		int tamanhoValores = valores.length;
		
		for(int i = 0; i < tamanhoValores; i++) {
			for(int j = 0; j < tamanhoValores - i - 1; j++) {
				if(cloneVector[j] > cloneVector[j + 1]) {
					trocaValores(cloneVector, j, j + 1);
				}
			}
		}
		
		return cloneVector;
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Enter vector size");
		int tamanho = ler.nextInt();
		
		System.out.println("Fill in the vector");
		int[] vetor1 = new int[tamanho];
		for(int i = 0; i < tamanho; i++) {
			System.out.println("Enter the position: " + (i+1) + "ª");
			vetor1[i] = ler.nextInt();
		}
		
		int[] result = bubbleSort(vetor1);
		
		System.out.println(Arrays.toString(vetor1) + " -> " + Arrays.toString(result));
	}

}
