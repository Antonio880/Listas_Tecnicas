import java.util.Arrays;
import java.util.Scanner;

public class Exerc20 {

	public static int[] removeLastElement(int[] arr) {
		return Arrays.copyOf(arr, arr.length - 1);
	}
	
	public static int[] vectorDecrease(int element) {
		int[] vector = new int[element];
		for(int i = 0; i < element -1; i++) {
			System.out.println(Arrays.toString(vector));
			vector = removeLastElement(vector);
		}
		System.out.println(Arrays.toString(vector));
		return vector;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o elemento para formar um vetor vazio do tamanho deste elemento:");
		int size = input.nextInt();
		int[] result = vectorDecrease(size);
		System.out.println("O resultado final eh " + Arrays.toString(result));
	}

}
