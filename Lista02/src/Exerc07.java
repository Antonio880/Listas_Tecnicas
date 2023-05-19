import java.util.Scanner;
public class Exerc07 {

	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Digite um numero inteiro maior do que 2: ");
	        int num = input.nextInt();
	        
	        int maiorPrimo = 0;
	        int candidato = num - 1;
	        
	        while (candidato > 1) {
	            boolean ehPrimo = true;
	            //se um número não é divisível por nenhum número entre 2 e sua raiz quadrada, então ele é primo.
	            for (int i = 2; i <= Math.sqrt(candidato); i++) {
	                if (candidato % i == 0) {
	                    ehPrimo = false;
	                }
	            }
	            
	            if (ehPrimo) {
	                maiorPrimo = candidato;
	                break;
	            }
	            
	            candidato--;
	        }
	        
	        if (maiorPrimo == 0) {
	            System.out.println("Nao ha numero primo menor do que " + num);
	        } else {
	            System.out.println("O maior numero primo menor do que " + num + " eh " + maiorPrimo);
	        }
	        
	        input.close();
	    }
		
	}


