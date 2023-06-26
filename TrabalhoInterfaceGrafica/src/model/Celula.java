package model;

import java.awt.Color;
import java.util.*;
import views.BotaoTabuleiro;

public class Celula {

	private int posicaoXCelula;
	private int posicaoYCelula;
	private String tipoRobo;
	private Robo robo;
	private Aluno aluno;
	private Bug bug;
	public BotaoTabuleiro button;
	
	public Celula(int x, int y) {
		posicaoXCelula = x;
		posicaoYCelula = y;
		robo = null;
		aluno = null;
		bug = null;
		button = new BotaoTabuleiro();
	}

	public Robo getRobo() {
		return robo;
	}

	public void setRobo(Robo robo) {
		this.robo = robo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Bug getBug() {
		return bug;
	}

	public void setBug(Bug bug) {
		this.bug = bug;
	}
	
}
