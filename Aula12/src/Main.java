import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		Biblioteca tecProg = new Biblioteca();
		
		
		tecProg.addPublicacoes(new Revista("tal", 5, 2000, "alguem"));  
		tecProg.addPublicacoes(new TCC("esse", 5, 1990, "essemsm"));
		tecProg.addPublicacoes(new Artigo("tipo", 10, 1500, "lairton"));
		tecProg.addPublicacoes(new Livros("taltal", 15, 1650, "Yan"));
		tecProg.addPublicacoes(new Livros("fisherMaluco", 12, 1990, "Pablo"));
		
		Aluno aluno1 = new Aluno("Antonio", 546113);
		Aluno aluno2 = new Aluno("Lucca", 991322);
		Professor professor = new Professor("jose", 123455);
		Servidores servidores = new Servidores("Ryam", 129932);
		
		Emprestimo emprestimo1 = new Emprestimo(tecProg.listaPublicacoes.get(3), aluno1, 4);
		Emprestimo emprestimo2 = new Emprestimo(tecProg.listaPublicacoes.get(2), aluno2, 5);
		Emprestimo emprestimo3 = new Emprestimo(tecProg.listaPublicacoes.get(1), professor, 2);
		Emprestimo emprestimo4 = new Emprestimo(tecProg.listaPublicacoes.get(0), servidores, 5);
		Emprestimo emprestimo5 = new Emprestimo(tecProg.listaPublicacoes.get(4), aluno1, 2);
		tecProg.addEmprestimo(emprestimo1);
		tecProg.addEmprestimo(emprestimo2);
		tecProg.addEmprestimo(emprestimo3);
		tecProg.addEmprestimo(emprestimo4);
		tecProg.addEmprestimo(emprestimo5);
		
		//tecProg.consultaMatricula(123455);
		//tecProg.relatorioClientes();
		
		//tecProg.relatorioAcervo();
		tecProg.relatorioEmprestimos();
	}
}
