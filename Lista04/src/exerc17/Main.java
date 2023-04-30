package exerc17;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario usuario1 = new Usuario("Antonio");
		Usuario usuario2 = new Usuario("Thais");
		JogoDaVelha jogo = new JogoDaVelha(usuario1, usuario2);
		jogo.Jogo();
	}

}
