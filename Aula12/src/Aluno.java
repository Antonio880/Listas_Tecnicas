import java.util.ArrayList;

public class Aluno extends Cliente{

	public Aluno(String nome, int matricula) {
		super(nome, matricula);
		this.tipoCliente = "Aluno";
		this.quantidadeMaxima = 5;
		this.diasEmprestimo = 10;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int darDesconto() {
		return 1;
	}

}
