import java.util.Scanner;
public class Exerc19 {

	public static boolean perfectNumber(int nTerms) {
		int sum = 0;
		boolean teste = false;
		for(int i = 1; i < nTerms; i++) {
			if(nTerms % i == 0) {
				sum += i;
			}
		}
		if(sum == nTerms) {
			teste = true;
		}else {
			teste = false;
		}
		
		return teste;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o numero:");
		int nTerms = input.nextInt();
		
		boolean result = perfectNumber(nTerms);
		if(result) {
			System.out.println("O numero " + nTerms + " eh perfeito");
		}else {
			System.out.println("O numero " + nTerms + " nao eh perfeito");
		}

	}

}
