public class Exerc08 {
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
		
		public static int[] vectorGrowing(int [] valores) {
			int[] valoresCopia = CloneVector(valores);

			int tamanhoValores = valores.length;
			
			for(int i = 0; i < tamanhoValores; i++) {
				for(int j = 0; j < tamanhoValores - i - 1; j++) {
					if(valoresCopia[j] > valoresCopia[j+1])
						trocaValores(valoresCopia, j, j+1);
				}
			}
			
			return valoresCopia;
		}
		
		public static int kthLargest(int[] arr, int k) {
		    //Arrays.sort(arr);
			//Função que coloca o vetor em ordem decrescente, desativei para tentar fazer ele sem a função
			int[] array = new int[arr.length];
			array = vectorGrowing(arr);
		    // Retorna o K-ésimo maior valor presente no vetor
		    return array[k-1];
		}
		
		public static void main(String[] args) {
			/*
			 * Sua função deverá receber um vetor 
			 * e um K e retornar o K-ésimo maior 
			 * valor presente no vetor.
			 * */
			
			int[] valores = { 10, 30, 20, 40, 50 };
			
			System.out.println(kthLargest(valores, 2));
		}

	}


