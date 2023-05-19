package OO;

import java.util.ArrayList;

public class CarrinhoCompras {

	private ArrayList<Produto> lista;

	public CarrinhoCompras() {
		lista = new ArrayList<Produto>();
	}

	public void addProduto(Produto p) {
		lista.add(p);
	}

	public double calcularValorProdutos() {
		double valor = 0;
		for (Produto produto : lista) {
			valor += produto.darDesconto();
		}
		return valor;
	}

	//Lugar errado
//	public boolean verficarFuncionamento() {
//
//		for (Produto produto : lista) {
//			if (produto instanceof ProdutosInformatica) {
//				if (((ProdutosInformatica) produto).estaFuncionado() == false) {
//					return false;
//				}
//			}
//		}
//		return true;
//
//	}

}
