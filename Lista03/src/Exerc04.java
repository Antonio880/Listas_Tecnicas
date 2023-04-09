import java.util.Scanner;
public class Exerc04 {
	public static int containsElements(int[] vetor1, int[] vetor2, int contador) {
		int amount = 0;
		//boolean controle1 = false;
		//boolean controle2 = false;
		
		for(int i = 0; i < vetor1.length; i++) {
			if(vetor1[i] == contador) {
				amount++;
				//controle1 = true;
			}
		}
		for(int i = 0; i < vetor2.length; i++) {
			if(vetor2[i] == contador) {
				amount++;
				//controle2 = true;
			}
		}
		return amount;
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int tamanho = ler.nextInt();
		
		System.out.println("Preencha o primeiro vetor!");
		int[] vetor1 = new int[tamanho];
		for(int i = 0; i < tamanho; i++) {
			System.out.println("Digite a posicao: " + (i+1) + "ª");
			vetor1[i] = ler.nextInt();
		}
		int[] vetor2 = new int[tamanho];
		System.out.println("Agora preencha o segundo vetor!");
		for(int i = 0; i < tamanho; i++) {
			System.out.println("Digite a posicao: " + (i+1) + "ª");
			vetor2[i] = ler.nextInt();
		}
		System.out.println("Agora digite o elemento que voce deseja verificar nos vetores: ");
		int contador = ler.nextInt();
	
		int result = containsElements(vetor1, vetor2, contador);
		System.out.println(contador + " -> " + result);
	}

}
