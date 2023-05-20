
public class Main {

	public static void main(String[] args) {
		
		Plano plano = new Plano(6,6);
		
		Jogo jogo = new Jogo("Antonio", plano);
		
		Andador andador = new Andador(1, "Robo Andador", 2, 2, plano);
		Peao peao = new Peao(2, "Robo Peao", 3, 5, plano);
		Torre torre = new Torre(3, "Robo Torre", 4, 4, plano);
		Bispo bispo = new Bispo(4, "Robo Bispo", 3, 4, plano);
		Cavalo cavalo = new Cavalo(5, "Robo Cavalo", 3, 3, plano);
		Rei rei = new Rei(6, "Robo Rei", 3, 3, plano);
		Rainha rainha = new Rainha(7, "Robo Rainha", 6, 5, plano);
		Aluno aluno = new Aluno("Antonio", plano);
		Bug bug = new Bug("Ryam", plano);
		//plano.retornarCelula(3, 4);
		jogo.Jogo();
		//andador.Retroceder(1);
		//torre.Retroceder(2);
		//peao.Avancar();
		//bispo.Retroceder(1);
		//cavalo.Retroceder(2);
		//rei.Avancar(1);
		//rainha.Retroceder(2);;
		//jogo.Jogo();
		

	}
}
