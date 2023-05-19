import java.util.Scanner;
public class Exerc06 {
	

	public static void main(String[] args) {
		/*
		 * Uma matriz simétrica é uma matriz que é igual a sua transposta.
		 * Para que esta definição faça sentido, apenas podemos considerar matrizes que são quadradas.
		 * De forma mais precisa, se A = a i j é uma matriz de ordem n x n, nós dizemos que é simétrica quando A = A T*
		 * */
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas");
		int i = ler.nextInt();
		System.out.println("Digite a quantidade de Colunas");
		int j = ler.nextInt();
		if(i == j) {
			int numeros[][];
			numeros = new int[i][j];
			boolean teste = true;
			System.out.println("Preencha os dados da matriz");
			for(int contLinha = 0;contLinha < i;contLinha++) {
				for(int contColuna = 0; contColuna < j; contColuna++) {
					System.out.println("Linha: " + (contLinha + 1) + "\nColuna: " + (contColuna + 1));
					numeros[contLinha][contColuna] = ler.nextInt();
				}
			}	
			for(int contLinha = 0;contLinha < i; contLinha++) {
				for(int contColuna = 0; contColuna < j; contColuna++)
					if(numeros[contLinha][contColuna] != numeros[contColuna][contLinha]) {
						teste = false;
					}
			}
			if(teste == false) {
				System.out.println("A matriz feita nao eh simetrica");
			}else {
				System.out.println("A matriz feita eh simetrica");
			}
		}else {
			System.out.println("Para fazer esta verificação é necessário que a matriz seja quadrada!");
		}
		
		ler.close();
	}
	
}
