import java.util.ArrayList;

public abstract class Cliente implements CalcularDesconto{

	public String nome;
	public int matricula;
	public ArrayList<Publicacoes> publicacoesEmprestadas;
	public int quantidadeMaxima;
	public double TPs = 0;
	public int diasEmprestimo;
	public String tipoCliente;
	
	public Cliente(String nome, int matricula) {
		this.nome = nome;
		publicacoesEmprestadas = new ArrayList<Publicacoes>();
		this.diasEmprestimo = 0;
		this.matricula = matricula;
	}
	
	public int calcularDias() {
		if(tipoCliente == "Professor") {
			diasEmprestimo = 20;
			return diasEmprestimo;
		}else if(tipoCliente == "Aluno") {
			diasEmprestimo = 10;
			return diasEmprestimo;
		}else if(tipoCliente == "Servidores") {
			diasEmprestimo = 15;
			return diasEmprestimo;
		}else {
			return 0;
		}
	}
	
	public double calcularDivida() {
		if(tipoCliente == "Professor") {
			TPs += 25;
			return TPs;
		}else if(tipoCliente == "Aluno") {
			TPs += 10;
			return TPs;
		}else if(tipoCliente == "Servidores") {
			TPs += 15;
			return TPs;
		}else {
			return 0;
		}
	}
	
	

	public int darDesconto() {
		return 1;
	}
}
