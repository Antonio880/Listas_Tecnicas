
import java.util.Scanner;
public class Exerc15 {
	
	public static boolean verificacaoPalindromo(String string) {
		int len = string.length();
		for(int i = 0; i < ((len/2)); i++) {
			if(string.charAt(i) == string.charAt(len - i - 1)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String string = new String();
		System.out.println("Digite a palavra para verificar se eh palindromo:");
		string = input.nextLine();
		
		boolean ehPalindromo = verificacaoPalindromo(string);
		if(ehPalindromo) {
			System.out.println("A string digitada eh palindromo");
		}else {
			System.out.println("A string digitada nao eh palindromo");
		}
	}

}
