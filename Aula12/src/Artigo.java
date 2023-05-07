
public class Artigo extends Publicacoes{

	public Artigo(String nome, int quantidade, int anoPublicacao, String autor) {
		super(nome, quantidade, anoPublicacao, autor);
		this.tipo = "Artigo";
		// TODO Auto-generated constructor stub
	}

	public void mostrarPublicacoes() {
		System.out.println("Publicacoes Disponiveis: ");
		System.out.println("Titulo: " + titulo + " - Ano de Publicacao: " + anoPublicacao + " - Autor: " + autor + " - Quantidade: " + quantidade);
	}
}
