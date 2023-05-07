
public abstract class Publicacoes {

	public String titulo;
	public int anoPublicacao;
	public String autor;
	public int quantidade;
	public String tipo;
	
	public Publicacoes(String nome, int quantidade, int anoPublicacao, String autor) {
		this.titulo = nome;
		this.quantidade = quantidade;
		this.anoPublicacao = anoPublicacao;
		this.autor = autor;
	}
}
