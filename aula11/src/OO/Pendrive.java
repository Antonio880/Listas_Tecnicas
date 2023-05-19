package OO;

public class Pendrive extends ProdutosInformatica {

	public Pendrive(int codigo, int estoque, double valor) {
		super(codigo, estoque, valor);
		// TODO Auto-generated constructor stub
	}

	public double darDesconto() {
		return this.valor - this.valor*0.1;
	}

	public boolean estaFuncionado() {
		return false;
	}

}
