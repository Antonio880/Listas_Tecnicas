package OO;

public abstract class ProdutosInformatica extends Produto 
implements LigarParaTestar 
 {

	public ProdutosInformatica(int codigo, int estoque, double valor) {
		super(codigo, estoque, valor);
		// TODO Auto-generated constructor stub
		if(this.estaFuncionado()) {
			
		}
	}
	
}
