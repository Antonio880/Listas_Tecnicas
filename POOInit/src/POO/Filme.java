package POO;

public class Filme {

	private int codigo;
	public String name;
	public Tipo tipo;
	
	public Filme(String name, Tipo tipo){
		this.name = name;
		this.tipo = tipo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
}
