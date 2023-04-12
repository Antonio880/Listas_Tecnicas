import java.util.Scanner;

public class Exerc18 {

	public static float calculateCompoundInterest(float capitalIni, float taxaJuros, int time) {
		float amount = capitalIni;
		for(int i = 1; i <= time; i++) {
			amount = (amount * taxaJuros) + amount;
		}
		return amount;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o capital inicial:");
		float capitalInicial = input.nextFloat();
		float juros;
		System.out.println("Digite a taxa de juros na forma decimal:");
		juros = input.nextFloat();
		if(juros > 1) {
			juros = juros/100;
		}
		System.out.println("Digite o tempo em meses:");
		int time = input.nextInt();
		
		float result = calculateCompoundInterest(capitalInicial, juros, time);
		
		System.out.println("O montante é de " + result);

	}

}
