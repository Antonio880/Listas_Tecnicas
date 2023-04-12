import java.util.Scanner;

public class Exerc10 {

	public static boolean equalityCheck(int[] vetor1, int[] vetor2) {
		for(int i = 0; i < vetor1.length; i++) 
			if(vetor1[i] != vetor2[i]) 
				return false;
			
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o tamanho do primeiro vetor");
		int tamPrimeiro = input.nextInt();
		System.out.println("Preencha o vetor");
		int[] vetor1 = new int[tamPrimeiro];
		for(int i = 0; i < tamPrimeiro; i++) {
			System.out.println("Posicao: " + i);
			vetor1[i] = input.nextInt();
		}

		System.out.println("Digite o tamanho do segundo vetor");
		int tamSegundo = input.nextInt();
		System.out.println("Preencha o vetor");
		int[] vetor2 = new int[tamSegundo];
		for(int i = 0; i < tamSegundo; i++) {
			System.out.println("Posicao: " + i);
			vetor2[i] = input.nextInt();
		}
		
		boolean result = equalityCheck(vetor1, vetor2);
		if(result) {
			System.out.println("Os dois vetores são iguais!");
		}else {
			System.out.println("Os dois vetores são diferentes!");
		}
		
		
	}

}
