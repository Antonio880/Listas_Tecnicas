import java.util.Scanner;
public class Exerc05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o limite esquerdo?");
		int limiteEsquerdo = scanner.nextInt();
		
		System.out.println("Qual o limite direito?");
		int limiteDireito = scanner.nextInt();
		
		for(int i = 0; i <= limiteEsquerdo; i++) {
			for(int j = 0; j<= limiteDireito; j++) {
				System.out.println(i + " - " + j);
			}
		}
	}

}
