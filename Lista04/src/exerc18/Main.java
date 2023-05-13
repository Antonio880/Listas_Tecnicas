package exerc18;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plano plano = new Plano(4,4);
		Moeda moeda = new Moeda("Moeda$", plano);
		CaractereEspecial caractere = new CaractereEspecial(plano);
		Robo robo = new Robo("Wall-E", plano, caractere);
		Jogo jogo = new Jogo("Antônio", plano, robo, moeda);
		
		
		//jogo.Jogo();
		
		
		//robo.avancarNorte();
		//robo.retrocederSul();
		//robo.avancarLeste();
		//robo.avancarOeste();
		//robo.avancarNordeste();
		//robo.avancarNoroeste();
		//robo.retrocederSudeste();
		//robo.retrocederSudoeste();
		
		
		jogo.Jogo();
		
	}

}
