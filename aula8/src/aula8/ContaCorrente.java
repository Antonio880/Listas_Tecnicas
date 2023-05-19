package aula8;

import java.util.ArrayList;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente, int codigo, int agencia) {
		super(cliente, codigo, agencia);
		// TODO Auto-generated constructor stub
	}

	public String imprimirSaldo() {
		Relatorio relatorio = new Relatorio(); //usa
		System.out.println("Sou diferente");
		return relatorio.gerarRelatorio(saldo);
	}
	public String imprimirSaldo(int numero) {
		Relatorio relatorio = new Relatorio(); //usa
		System.out.println("Sou diferente");
		
		
		return relatorio.gerarRelatorio(saldo);
	}
}
