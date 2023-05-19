package aula8;

public class ATM {

	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Joao", "080.080.080-78");
		
		ContaCorrente conta = new ContaCorrente(cliente, 2, 189);
		conta.setSaldo(200);
		System.out.println(conta.imprimirSaldo());
		System.out.println(conta.imprimirSaldo(10));
		
		ContaPoupanca poupanca= new ContaPoupanca(cliente, 2, 189);
		poupanca.setSaldo(200);
		System.out.println(poupanca.imprimirSaldo());
	}
	
}
