package aula8;

public class Conta {

	protected int codigo;
	protected int agencia;
	protected Cliente cliente; // ter
	protected float saldo;

	public Conta(Cliente cliente, int codigo, int agencia) {
		this.cliente = cliente;
		this.codigo = codigo;
		this.agencia = agencia;
		this.saldo= 100;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		if (saldo >= 0)
			this.saldo += saldo;
	}

	public String imprimirSaldo() {
		Relatorio relatorio = new Relatorio(); //usa
		return relatorio.gerarRelatorio(this.saldo);
	}

}
