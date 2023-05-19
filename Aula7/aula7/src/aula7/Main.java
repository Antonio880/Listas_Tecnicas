package aula7;

public class Main {

	public static void main(String[] args) {
//		int    numero   = 20;
	
		Carro  meuCarro = new Carro();
		meuCarro.velocidade =30;
		meuCarro.setCodigo(5);
		System.out.println(meuCarro.getCodigo());
		meuCarro.rotina();
		
//		meuCarro.codigo =20;
		
		
		
		
		
//		numero = 10;
//		meuCarro.placa="AAA-1212";
//		System.out.println( meuCarro.placa);
//		
//		meuCarro.acelerar(50);
//		System.out.println(meuCarro.velocidade);
	}

}
