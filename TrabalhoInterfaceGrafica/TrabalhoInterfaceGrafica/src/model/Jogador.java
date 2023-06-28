package model;
import persistencia.*;

public class Jogador {
	
	private String nome;
	public int rodada;
	private int celulasNaoClicadas;
	private int bugsEncontrados;
	private int alunosEncontrados;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCelulasNaoClicadas() {
		return celulasNaoClicadas;
	}

	public void setCelulasNaoClicadas(int celula) {
		this.celulasNaoClicadas += celula;
	}
	
	public int addCelulasNaoClicadas() {
		return celulasNaoClicadas++;
	}

	public int getBugsEncontrados() {
		return bugsEncontrados;
	}

	public void setBugsEncontrados() {
		this.bugsEncontrados++;
	}

	public int getAlunosEncontrados() {
		return alunosEncontrados;
	}

	public void setAlunosEncontrados() {
		this.alunosEncontrados++;
	}
	
	
}
