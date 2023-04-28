package exerc13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV tv = new TV(10, false, 1);
		ControleRemoto controle = new ControleRemoto(1, tv);
		
		controle.mudarCanal(15);
		controle.mudarCanalUnidade("aumentar");
		controle.mudarVolume("aumentar");
		System.out.println(controle.toString());
	}

}
