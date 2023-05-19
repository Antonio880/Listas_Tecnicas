package locadora;

public class Filme {

	private int codigo;
	public String nome;
	public Tipo tipo;
	
	public Filme (String nome, Tipo tipo) {
		this.nome= nome;
		this.tipo=tipo;
	}

	public int getCodigo() {
		return codigo;
	}
	
}
