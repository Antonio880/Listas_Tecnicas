
public class Emprestimo {

	public Publicacoes publicacao;
	public Cliente cliente;
	public int totalLivros;
	public int totalArtigos;
	public int totalTCC;
	public int totalRevista;
	
	public Emprestimo(Publicacoes publicacao, Cliente cliente, int quantidade) {
		this.publicacao = publicacao;
		this.cliente = cliente;
		
		if(quantidade < publicacao.quantidade && cliente.publicacoesEmprestadas.size() < cliente.quantidadeMaxima && this.publicacao.titulo == publicacao.titulo) {
			cliente.publicacoesEmprestadas.add(publicacao);
			cliente.quantidadeMaxima++;
			cliente.calcularDias();
			cliente.TPs = cliente.calcularDivida();
			double calculoTPs = this.descontoEmprestimo();
			cliente.TPs = calculoTPs;
			System.out.println(cliente.tipoCliente + ": " + cliente.diasEmprestimo + " dias.");
			System.out.println(cliente.tipoCliente + ": " + calculoTPs + " tps.");
			if(cliente.TPs % 50 == 0) {
				System.out.println("Você precisa doar uma publicacao!!");
			}
			if(publicacao.tipo == "Livros") {
				totalLivros += quantidade;
			}else if(publicacao.tipo == "Artigo") {
				totalArtigos += quantidade;
			}else if(publicacao.tipo == "TCC") {
				totalTCC += quantidade;
			}else if(publicacao.tipo == "Revista") {
				totalRevista += quantidade;
			}
			publicacao.quantidade -= quantidade;
		}
	}
	
	public double descontoEmprestimo() {
		if(cliente.darDesconto() == 1 && publicacao.tipo == "Livro") {
			return cliente.TPs - (cliente.TPs*0.1);
		}else if(cliente.darDesconto() == 1 && publicacao.tipo == "Revista") {
			return cliente.TPs - (cliente.TPs*0.01);
		}else if(cliente.darDesconto() == 1 && publicacao.tipo == "Artigo") {
			return cliente.TPs - (cliente.TPs*0.5);
		}else if(cliente.darDesconto() == 0) {
			return cliente.TPs;
		}else {
			return 1;
		}
	}
	
	
}
