package negocio;

import java.util.Random;

import javax.swing.JOptionPane;

import apresentacao.*;

public class Jogo {

	private Jogador jogador;
	private Tela tela;
	private Terminal terminal;
	private int numeroEscolhido;
	private boolean jogando;

	public Jogo() {
		tela = new Tela();
		terminal = new Terminal();
		jogador = new Jogador();
		numeroEscolhido = 50;
		jogando = true;
		Random random = new Random();
		do {
			numeroEscolhido = random.nextInt(100);
			if(numeroEscolhido >= 0 && numeroEscolhido <=100) {
				jogando = false;
			}
		}while(jogando);
	}

	public void inciarJogoTerminal() {
		jogador.setNome(terminal.entradaNome());
		terminal.mesagem("Seja bem vindo: " + jogador.getNome());
	}

	public void inciarJogoGUI() {
		jogador.setNome(tela.entradaDados("Qual � o seu nome?"));
		tela.mesagem("Seja bem vindo: " + jogador.getNome());
		jogadas();
	}

	public int solicitarNumero() {
		String numero = " ";
		int numInt = 0;
		do {
			try {
				numero = tela.entradaDados("Informe um numero:");
				numInt = Integer.parseInt(numero);
				jogando = false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Digite um numero valido!");
				jogando = true;
			}
		}while(jogando);
		return numInt;
	}

	public void jogadas() {
		do {
			verificarAcerto();
		} while (jogando);

		fimDoJogo();
	}

	private void fimDoJogo() {

		String numeros = "";
		for (Integer numero : jogador.getListaNumeros()) {
			numeros += " - " + numero;
		}
		tela.mesagem("Numeros apostados: " + numeros);

	}

	public boolean verificarMenor(int numero) {
		if (numero < numeroEscolhido)
			return true;

		return false;
	}

	public void verificarAcerto() {
		int numero = solicitarNumero();
		jogador.addNumero(numero);
		if (numero == numeroEscolhido) {
			tela.mesagem("Parabens voce acertou! numero de tentativas: " + jogador.getNumeroTentativa());
			jogando = false;
		} else {
			
			jogador.incrementarNumeroTentativa();
			tela.mesagem("Deu ruim,  voce errou " + jogador.getNumeroTentativa());
			jogando = true;
			if (verificarMenor(numero)) {
				tela.mesagem("tente um numero maior");
			} else {
				tela.mesagem("Tente numero menor");
			}
		}
	}

	// public void verificarAcerto() {
	// do {
	// if (solicitarNumero() == numeroEscolhido) {
	// jogador.setNumeroTentativa();
	// tela.mesagem("Parabens voce acertou! numero de tentativas: " +
	// jogador.getNumeroTentativa());
	// return;
	// } else {
	// tela.mesagem("Deu ruim, voce errou");
	// jogador.setNumeroTentativa();
	// }
	// } while (true);
	// }
}
