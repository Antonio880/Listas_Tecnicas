import java.util.ArrayList;

public class Servidores extends Cliente{

	public Servidores(String nome, int matricula) {
		super(nome, matricula);
		this.tipoCliente = "Servidores";
		this.diasEmprestimo = 10;
		this.quantidadeMaxima = 15;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int darDesconto() {
		return 0;
	}

}
