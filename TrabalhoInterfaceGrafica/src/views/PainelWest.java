package views;

import model.Jogador;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import model.*;
import views.paineisEsquerda.*;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import model.Celula;

public class PainelWest extends JPanel{

	public PrimeiroBloco first;
	public SegundoBloco second;
	public PainelTabuleiro painelTabuleiro;
	Robo cavalo;
	Robo torre;
	Robo bispo;
	
	BotaoEsquerdo verificar;
	BotaoEsquerdo proxJogada;
	BotaoEsquerdo sair;
	Jogador jogador;

	public PainelWest(PainelTabuleiro painel, Jogador jogador) {
		cavalo = new Robo();
		torre = new Robo();
		bispo = new Robo();
		this.jogador = jogador;
		this.painelTabuleiro = painel;
		first = new PrimeiroBloco(this.painelTabuleiro);
		second = new SegundoBloco();
		this.jogador = jogador;
		first.setPreferredSize(new Dimension(this.getWidth(), 350));
		this.setLayout(new GridLayout(5,1));
		verificar = new BotaoEsquerdo("Verificar");
		verificar.addActionListener(new Verificar());
		proxJogada = new BotaoEsquerdo("Próxima Jogada");
		proxJogada.setEnabled(false);
		proxJogada.addActionListener(new ProxJogada());
		sair = new BotaoEsquerdo("Sair");
		
		this.setBackground(Color.LIGHT_GRAY);
		
		this.add(first);
		this.add(second);
		
		this.add(verificar);
		this.add(proxJogada);
		this.add(sair);
		
		this.setVisible(true);
	}

	public PrimeiroBloco getFirst() {
		return first;
	}
	
	public SegundoBloco getSecond() {
		return second;
	}

	public PainelTabuleiro getPainelTabuleiro() {
		return painelTabuleiro;
	}

	public void salvarAluno(PainelTabuleiro p) {
		for (Celula celula : p.listaCelulas) {
			if(celula.getAluno() instanceof Aluno && celula.getRobo() instanceof Robo) {
				celula.getRobo().encontrouAluno();
				if(celula.getRobo() instanceof Cavalo) {
					cavalo.encontrouAluno();
					jogador.setAlunosEncontrados();
					second.pontuacaoCavalo.setText(""+cavalo.pontuacao);
				}else if(celula.getRobo() instanceof Bispo) {
					bispo.encontrouAluno();
					jogador.setAlunosEncontrados();
					second.pontuacaoBispo.setText(""+bispo.pontuacao);
				}else if(celula.getRobo() instanceof Torre) {
					torre.encontrouAluno();
					jogador.setAlunosEncontrados();
					second.pontuacaoTorre.setText(""+torre.pontuacao);
				}
				
				first.imageAluno.setTotal(jogador.getAlunosEncontrados());
			}
		}
	}
	
	public void perderPontos(PainelTabuleiro p) {
		for (Celula celula : p.listaCelulas) {
			if(celula.getBug() instanceof Bug && celula.getRobo() instanceof Robo) {
				celula.getRobo().encontrouBug();
				if(celula.getRobo() instanceof Cavalo) {
					cavalo.encontrouBug();
					jogador.setBugsEncontrados();
					second.pontuacaoCavalo.setText(""+cavalo.pontuacao);
				}else if(celula.getRobo() instanceof Bispo) {
					bispo.encontrouBug();
					jogador.setBugsEncontrados();
					second.pontuacaoBispo.setText(""+bispo.pontuacao);
				}else if(celula.getRobo() instanceof Torre) {
					torre.encontrouBug();
					jogador.setBugsEncontrados();
					second.pontuacaoTorre.setText(""+torre.pontuacao);
				}
				first.imageBug.setTotal(jogador.getBugsEncontrados());
			}
		}
	}
	
	public void verificarCelulasClicadasVazias(PainelTabuleiro p) {
		for (Celula celula : p.listaCelulas) {
			if(celula.getRobo() instanceof Robo && celula.button.getIcon().equals("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\Bug-removebg-preview.png") && celula.button.getIcon().equals("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\pessoinha.jpg")) {
				jogador.addCelulasNaoClicadas();
			}
		}
	}
	
	public void somarPontos() {
		int total = Integer.parseInt(second.pontuacaoBispo.getText()) + Integer.parseInt(second.pontuacaoCavalo.getText()) + Integer.parseInt(second.pontuacaoTorre.getText());
		first.pontuacao.setText(""+total);
	}
	
	public Celula verificarVitoria() {
		for (Celula celula : painelTabuleiro.listaCelulas) {
			if(celula.getAluno() != null) {
				return celula;
			}
		}
		return null;
	}
	
	private class Verificar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			if(second.cavalo.verificar || second.bispo.verificar || second.torre.verificar) {
				JOptionPane.showMessageDialog(null, "Clique nas Peças para poder continuar");
			}else {
				second.cavalo.verificar = true;
				second.bispo.verificar = true;
				second.torre.verificar = true;
				verificar.setEnabled(false);
				for (Celula celula : painelTabuleiro.listaCelulas) {
					if(celula.button.getTipo().equals("cavalo")) {
						celula.setRobo(new Cavalo());
					}else if(celula.button.getTipo().equals("bispo")) {
						celula.setRobo(new Bispo());
					}else if(celula.button.getTipo().equals("torre")) {
						celula.setRobo(new Torre());
					}
				}
				salvarAluno(painelTabuleiro);
				perderPontos(painelTabuleiro);
				somarPontos();
				verificarCelulasClicadasVazias(painelTabuleiro);
				proxJogada.setEnabled(true);
				
				File arquivo = new File("C:\\Users\\Antônio Cruz\\eclipse-workspace\\Dado.txt");
				try {
		            
		            FileWriter escritor = new FileWriter(arquivo, false);

		            escritor.write("");

		            escritor.close();

		            System.out.println("Conteúdo Limpo com sucesso");

		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
			}
		}
	}
	
	private class ProxJogada implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			jogador.rodada++;
			
			second.bispo.setEnabled(true);
			second.cavalo.setEnabled(true);
			second.torre.setEnabled(true);
			verificar.setEnabled(true);
			for (Celula celula : painelTabuleiro.listaCelulas) {
				if(celula.getBug() instanceof Bug && celula.getRobo() instanceof Robo) {
					celula.setBug(null);
					celula.button.setIcon(new Icon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\Bug-removebg-preview.png", 40,40));
				}
				if(celula.getAluno() instanceof Aluno && celula.getRobo() instanceof Robo) {
					celula.setAluno(null);
					celula.button.setIcon(new Icon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\pessoinha.jpg", 20, 30));
				}
			}
			if(verificarVitoria() == null) {
				getRootPane().getParent().setVisible(false); // fecha a janela
		        JOptionPane.showMessageDialog(null, "Parabéns " + jogador.getNome() + " , você encontrou os " + jogador.getAlunosEncontrados() + " Alunos.");
			}
		}
	}
}
