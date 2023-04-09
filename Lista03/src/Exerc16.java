import java.util.Scanner;

public class Exerc16 {

	public static boolean isPrime(int num) {
		if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if( num % i == 0)
                return false;
                /*Isso é feito porque, se um número não é divisível por nenhum número até a sua raiz quadrada, então ele não pode ser divisível por nenhum outro número maior do que a sua raiz quadrada.*/
        }
        return true;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter with number!");
		int num = input.nextInt();

		boolean isPrime = isPrime(num);
		if(isPrime) {
			System.out.println("the number " + num + " is Prime");
		}else {
			System.out.println("Is't prime");
		}
	}

}
