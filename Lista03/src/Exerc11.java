import java.util.Scanner;
public class Exerc11 {

	public static float Exponentiation(float base, int expo) {
		float amount = base;
		if(expo >= 0) {
			for(int i = 1; i < expo; i++) {
				 amount = amount * base;
			}
		}else {
			amount = (1/base);
			for(int i = 0; i > expo + 1; i--) {
				 amount = amount * (1/base);
			}
		}
		return amount;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite aqui a base:");
		float base = input.nextInt();
		System.out.println("Digite aqui o expoente sendo positivo:");
		int expo = input.nextInt();
		
		float result = Exponentiation(base, expo);
		
		System.out.println(base + "^" + expo + " = " + result);
		
		input.close();
	}

}
