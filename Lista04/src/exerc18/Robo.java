package exerc18;

import java.util.ArrayList;

public class Robo {

	protected int posicaoXRobo;
	protected int posicaoYRobo;
	protected String nome;
	protected Plano plano;
	protected String movimentacaoRobo;
	protected CaractereEspecial caractere;
	
	public Robo(String nome, Plano plano, CaractereEspecial caractere) {
		this.nome = nome;
		this.plano = plano;
		this.caractere = caractere;
		this.movimentacaoRobo = " ";
		
		posicaoXRobo = plano.tamanhoX/2;
		posicaoYRobo = plano.tamanhoY/2;
		
		addInPlanRobo(posicaoXRobo, posicaoYRobo);
		
	}
	
	public void addInPlanRobo(int x, int y) {
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.areaJogo[i][j].posicaoXCelula == x && plano.areaJogo[i][j].posicaoYCelula == y) {
					plano.areaJogo[i][j].robo = this;
				}
			}
		}
	}
	
	public int avancarNorte() {
		Celula novaCelula = null;
		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.areaJogo[i][j].robo == this && plano.areaJogo[i][j].robo instanceof Robo) {
					plano.areaJogo[i][j].robo = null;
					plano.areaJogo[i][j].caractere = caractere;
					
					novaPosicaoX = plano.areaJogo[i][j].posicaoXCelula - 1;
					novaPosicaoY = plano.areaJogo[i][j].posicaoYCelula;
					if(novaPosicaoX <= 0){
						novaPosicaoX = 0;
					}
					novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				}
			}
		}
		if(plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda instanceof Moeda) {
			plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda = null;
		}
		if(novaCelula != null) {
			this.posicaoXRobo = novaPosicaoX;
			this.posicaoYRobo = novaPosicaoY;
			novaCelula.robo = this;
		}
		
		int totalAndadoNorte = 0;
		return ++totalAndadoNorte;
	}
	

	public int retrocederSul() {
		Celula novaCelula = null;

		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.areaJogo[i][j].robo == this && plano.areaJogo[i][j].robo instanceof Robo) {
					plano.areaJogo[i][j].robo = null;
					plano.areaJogo[i][j].caractere = caractere;
					
					novaPosicaoX = plano.areaJogo[i][j].posicaoXCelula + 1;
					novaPosicaoY = plano.areaJogo[i][j].posicaoYCelula;
					if(novaPosicaoX >= plano.tamanhoX){
						novaPosicaoX = plano.tamanhoX - 1;
					}
					novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				}
			}
		}
		if(plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda instanceof Moeda) {
			plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda = null;
		}
		if(novaCelula != null) {
			this.posicaoXRobo = novaPosicaoX;
			this.posicaoYRobo = novaPosicaoY;
			novaCelula.robo = this;	
		}
		int totalAndadoSul = 0;
		return ++totalAndadoSul;
	}
	
	public int avancarLeste() {
		Celula novaCelula = null;
		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.areaJogo[i][j].robo == this && plano.areaJogo[i][j].robo instanceof Robo) {
					plano.areaJogo[i][j].robo = null;
					plano.areaJogo[i][j].caractere = caractere;
					
					novaPosicaoX = plano.areaJogo[i][j].posicaoXCelula;
					novaPosicaoY = plano.areaJogo[i][j].posicaoYCelula + 1;
					if(novaPosicaoY >= plano.tamanhoY) {
						novaPosicaoY = plano.tamanhoY -1;
					}
					novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				}
			}
		}
		if(plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda instanceof Moeda) {
			plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda = null;
		}
		if(novaCelula != null) {
			this.posicaoXRobo = novaPosicaoX;
			this.posicaoYRobo = novaPosicaoY;
			novaCelula.robo = this;
		}
		int totalAndadoLeste = 0;
		return ++totalAndadoLeste;
	}

	public int avancarOeste() {
		Celula novaCelula = null;
		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.areaJogo[i][j].robo == this && plano.areaJogo[i][j].robo instanceof Robo) {
					plano.areaJogo[i][j].robo = null;
					plano.areaJogo[i][j].caractere = caractere;
					
					novaPosicaoX = plano.areaJogo[i][j].posicaoXCelula;
					novaPosicaoY = plano.areaJogo[i][j].posicaoYCelula - 1;
					if(novaPosicaoY <= 0){
						novaPosicaoY = 0;
					}
					novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				}
			}
		}
		if(plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda instanceof Moeda) {
			plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda = null;
		}
		if(novaCelula != null) {
			this.posicaoXRobo = novaPosicaoX;
			this.posicaoYRobo = novaPosicaoY;
			novaCelula.robo = this;
		}
		int totalAndadoOeste = 0;
		return ++totalAndadoOeste;
	}
	
	public int avancarNordeste() {
		Celula novaCelula = null;
		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.areaJogo[i][j].robo == this && plano.areaJogo[i][j].robo instanceof Robo) {
					plano.areaJogo[i][j].robo = null;
					plano.areaJogo[i][j].caractere = caractere;
					
					novaPosicaoX = plano.areaJogo[i][j].posicaoXCelula - 1;
					novaPosicaoY = plano.areaJogo[i][j].posicaoYCelula + 1;
					if(novaPosicaoX <= plano.tamanhoX && novaPosicaoY >= plano.tamanhoY) {
						novaPosicaoX = 0;
						novaPosicaoY = plano.tamanhoY - 1;
					}else if(novaPosicaoX > plano.tamanhoX && novaPosicaoY >= plano.tamanhoY) {
						novaPosicaoY = plano.tamanhoY - 1;
					}
					novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				}
			}
		}
		if(plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda instanceof Moeda) {
			plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda = null;
		}
		if(novaCelula != null) {
			this.posicaoXRobo = novaPosicaoX;
			this.posicaoYRobo = novaPosicaoY;
			novaCelula.robo = this;
		}
		int totalAndadoNordeste = 0;
		return ++totalAndadoNordeste;
	}
	
	public int avancarNoroeste() {
		Celula novaCelula = null;
		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.areaJogo[i][j].robo == this && plano.areaJogo[i][j].robo instanceof Robo) {
					plano.areaJogo[i][j].robo = null;
					plano.areaJogo[i][j].caractere = caractere;
					
					novaPosicaoX = plano.areaJogo[i][j].posicaoXCelula - 1;
					novaPosicaoY = plano.areaJogo[i][j].posicaoYCelula - 1;
					if(novaPosicaoX <= 0 && novaPosicaoY <= 0) {
						novaPosicaoX = 0;
						novaPosicaoY = 0;
					}else if(novaPosicaoX > 0 && novaPosicaoY <= 0) {
						novaPosicaoY = 0;
					}
					novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				}
			}
		}
		if(plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda instanceof Moeda) {
			plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda = null;
		}
		if(novaCelula != null) {
			this.posicaoXRobo = novaPosicaoX;
			this.posicaoXRobo = novaPosicaoY;
			novaCelula.robo = this;
		}
		int totalAndadoNoroeste = 0;
		return ++totalAndadoNoroeste;
	}
	
	public int retrocederSudeste() {
		Celula novaCelula = null;
		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.areaJogo[i][j].robo == this && plano.areaJogo[i][j].robo instanceof Robo) {
					plano.areaJogo[i][j].robo = null;
					plano.areaJogo[i][j].caractere = caractere;
					
					novaPosicaoX = plano.areaJogo[i][j].posicaoXCelula + 1;
					novaPosicaoY = plano.areaJogo[i][j].posicaoYCelula + 1;
					if(novaPosicaoX >= plano.tamanhoX && novaPosicaoY >= 0) {
						novaPosicaoX = plano.tamanhoX - 1;
						novaPosicaoY = plano.tamanhoY - 1;
					}else if(novaPosicaoX <= plano.tamanhoX && novaPosicaoY >= plano.tamanhoY) {
						
						novaPosicaoY = plano.tamanhoY -1;
					}
					novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				}
			}
		}
		if(plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda instanceof Moeda) {
			plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda = null;
		}
		if(novaCelula != null) {
			this.posicaoXRobo = novaPosicaoX;
			this.posicaoYRobo = novaPosicaoY;
			novaCelula.robo = this;
		}
		int totalAndadoSudeste = 0;
		return ++totalAndadoSudeste;
	}
	
	public int retrocederSudoeste() {
		Celula novaCelula = null;
		int novaPosicaoX = 0;
		int novaPosicaoY = 0;
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.areaJogo[i][j].robo == this && plano.areaJogo[i][j].robo instanceof Robo) {
					plano.areaJogo[i][j].robo = null;
					plano.areaJogo[i][j].caractere = caractere;
					
					novaPosicaoX = plano.areaJogo[i][j].posicaoXCelula + 1;
					novaPosicaoY = plano.areaJogo[i][j].posicaoYCelula - 1;
					if(novaPosicaoX >= plano.tamanhoX && novaPosicaoY <= 0) {
						novaPosicaoX = plano.tamanhoX -1;
						novaPosicaoY = 0;
					}else if(novaPosicaoX <= plano.tamanhoX && novaPosicaoY <= 0) {
						novaPosicaoX = plano.tamanhoX -1;
						novaPosicaoY = 0;
					}
					novaCelula = plano.retornarCelula(novaPosicaoX, novaPosicaoY);
				}
			}
		}
		if(plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda instanceof Moeda) {
			plano.areaJogo[novaPosicaoX][novaPosicaoY].moeda = null;
		}
		if(novaCelula != null) {
			this.posicaoXRobo = novaPosicaoX;
			this.posicaoYRobo = novaPosicaoY;
			novaCelula.robo = this;
		}
		int totalAndadoSudoeste = 0;
		return ++totalAndadoSudoeste;
	}
	
	
	
	public boolean verificarMovimentacao(String opcao) {
		if(movimentacaoRobo.equals(opcao)) {
			this.movimentacaoRobo = opcao;
			return true;
		}else {
			this.movimentacaoRobo = opcao;
			return false;
			
		}
	}
}

