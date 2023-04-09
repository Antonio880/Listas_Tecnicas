import java.util.Scanner;
public class Exerc01 {

	public static int somaVetorSemExtremos(int vetor[]) {
		int soma = 0;
		for(int i = 2; i < vetor.length - 2; i++)
			soma += vetor[i];
		
		return soma;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int tamanho = ler.nextInt();
		int[] vetor = new int[tamanho];
		
;		System.out.println("Preencha o vetor");
		for(int i = 0; i < tamanho; i++) {
			if(i == 0) {
			System.out.println("Posição:" + i + "ª");
			vetor[i] = ler.nextInt();
			}else {
			System.out.println("Posição:" + i + "º");
			vetor[i] = ler.nextInt();
			}
		}
		int somaVetores = somaVetorSemExtremos(vetor);
		
		System.out.println("A soma dos vetores sem contar os dois primeiros elementos e os dois ultimos eh: " + somaVetores);
		ler.close();
	}
	

}
