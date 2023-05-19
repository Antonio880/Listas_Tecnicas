package OO;

public abstract class Produto implements DescontoEspecial {

	public int codigo;
	public double valor;
	public int estoque;
	
	public Produto(int codigo, int estoque, double valor) {
		this.codigo= codigo;
		this.estoque= estoque;
		this.valor=valor;
	}
	
	public double darDesconto() {
		return this.valor;
	}
	
}
