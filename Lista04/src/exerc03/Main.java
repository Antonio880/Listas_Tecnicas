package exerc03;

public class Main {

	public static void main(String[] args) {
		
	Fatura fatura = new Fatura(2, 50.00,"leite desnatado", 14, 3.57);
	
	System.out.println(fatura.descricao);
	fatura.setPrecoTotal(60.00);
	System.out.println(fatura.precoTotal); 
	
	System.out.println(fatura.getValorFatura());
	System.out.println(fatura.gerarDesconto(100.00, 5));

	}

}
