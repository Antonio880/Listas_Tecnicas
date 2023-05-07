import java.util.ArrayList;

public class Professor extends Cliente{

	public Professor(String nome, int matricula) {
		super(nome, matricula);
		this.tipoCliente = "Professor";
		this.quantidadeMaxima = 7;
		this.diasEmprestimo = 20;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int darDesconto() {
		return 0;
	}

}
