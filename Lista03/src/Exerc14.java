import java.util.Arrays;
import java.util.Scanner;

public class Exerc14 {

	public static int[] CloneVector(int[] vetor){
		int [] cloneVector = new int[vetor.length];
		for(int i = 0; i < vetor.length; i++) {
			cloneVector[i] = vetor[i];
		}
		return cloneVector;
	}
	
	public static int[] vectorElementRemoval(int[] vector, int elementRemoval) {
		int EqualAmounts = 0;
		
		for (int i = 0; i < vector.length; i++) {
			if(elementRemoval == vector[i]) {
				EqualAmounts++;
			}
		}
		
		int[] result = new int[vector.length - EqualAmounts];
		int j = 0;
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != elementRemoval) {
				result[j] = vector[i];
				j++;
			}
		}
		
		if(EqualAmounts == 0) {
			result = CloneVector(vector);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Enter first vector size");
		int size = ler.nextInt();
		
		System.out.println("Fill in the first vector");
		int[] vector = new int[size];
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the position: " + (i+1) + "ª");
			vector[i] = ler.nextInt();
		}
		
		System.out.println("Enter the element you want to remove");
		int element = ler.nextInt();
		int[] vectorResult = vectorElementRemoval(vector, element);
		
		System.out.println("This vector Result is " + Arrays.toString(vectorResult));
	}

}
