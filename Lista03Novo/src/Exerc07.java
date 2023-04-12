import java.util.Scanner;

public class Exerc07 {

	public static boolean isGrowing(int[] value) {
		for(int i = 0; i < value.length - 1; i++) {
			if(value[i] > value[i + 1])
				return false;
		}
		return true;
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
		
		boolean result = isGrowing(vetor1);
		if(result) 
			System.out.println("O vetor é crescente");
		else 
			System.out.println("O vetor não é crescente");
		
		
	}

}
