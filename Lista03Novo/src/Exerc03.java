import java.util.Scanner;
public class Exerc03 {

	public static float mediaPonderada(float[] notas, int[] pesos, int tamanho){
		float soma = 0;
		int div = 0;
		for(int i = 0; i < tamanho; i++) {
			soma = (notas[i] * pesos[i]) + soma;
			div += pesos[i];
		}
		float mediaPonderada = soma/div;
		
		return mediaPonderada;
	}
	
	/*public static float somaVetor(float[] vetor) {
	    float soma = 0;
	    for (int i = 0; i < vetor.length; i++) {
	        soma += vetor[i];
	    }
	    return soma;
	}
	*/
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas");
		int tamanho = ler.nextInt();
		
		float[] notas = new float[tamanho];
		for(int i = 0; i < tamanho; i++) {
			System.out.println("Digite a " + (i+1) + "ª Nota!");
			notas[i] = ler.nextInt();
				
		}
		
		int[] pesos = new int[tamanho];
		for(int i = 0; i < tamanho; i++) {
			
			System.out.println("Digite o " + (i+1) + "º Peso!");
			pesos[i] = ler.nextInt();
				
		}
		
		float result = mediaPonderada(notas, pesos, tamanho);
		
		System.out.println("A media de notas eh " + result);
		
		ler.close();
	}

}
