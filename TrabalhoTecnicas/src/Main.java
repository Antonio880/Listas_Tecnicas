
public class Main {

	public static void main(String[] args) {
		
		Plano plano = new Plano(5,5);
		
		Jogo jogo = new Jogo("Antonio", plano);
		
		Andador andador = new Andador(1, "Robo Andador", 2, 2, plano);
		//Peao peao = new Peao(2, "Robo Peao", 3, 5, plano);
		//Torre torre = new Torre(3, "Robo Torre", 4, 4, plano);
		Bispo bispo = new Bispo(4, "Robo Bispo", 5, 3, plano);
		//Cavalo cavalo = new Cavalo(5, "Robo Cavalo", 4, 3, plano);
		//Rei rei = new Rei(6, "Robo Rei", 3, 3, plano);
		//plano.retornarCelula(3, 4);
		jogo.Jogo();
		andador.Avancar(1);
		//peao.Avancar();
		bispo.Avancar(3);
		//cavalo.Retroceder(1);
		//cavalo.Retroceder(1);
		//bispo.Retroceder(1);
		//rei.Retroceder(1);
		jogo.Jogo();
		

	}
}
