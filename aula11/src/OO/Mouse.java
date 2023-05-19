package OO;

public class Mouse  extends ProdutosInformatica{

	public Mouse(int codigo, int estoque, double valor) {
		super(codigo, estoque, valor);
		// TODO Auto-generated constructor stub
	}

	public double darDesconto() {
		return this.valor - this.valor*0.2;
	}

	public boolean estaFuncionado() {
		return false;
	}

}
