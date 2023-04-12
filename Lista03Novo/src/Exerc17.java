import java.util.Scanner;
public class Exerc17 {
	
	public static String wordInversion(String string) {
		char[] CharCopy = new char[string.length()];
		CharCopy = string.toCharArray();
		char[] CharStringInvertida = new char[string.length()+1];
		CharStringInvertida[string.length()] = '\0';

		for(int i = string.length() - 1, j = 0; i >= 0; i--, j++) {
			CharStringInvertida[i] = CharCopy[j];
		}	
		return new String(CharStringInvertida);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String string = new String();
		System.out.println("type the string:");
		string = input.nextLine();
		
		String stringResult = wordInversion(string);
		
		System.out.println(string + " -> " + stringResult);
	}

}
