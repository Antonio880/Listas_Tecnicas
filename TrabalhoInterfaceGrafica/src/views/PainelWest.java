package views;
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

	PrimeiroBloco first;
	SegundoBloco second;
	PainelTabuleiro painelTabuleiro;
	
	BotaoEsquerdo verificar;
	BotaoEsquerdo proxJogada;
	BotaoEsquerdo sair;

	public PainelWest(PainelTabuleiro painel) {
		
		this.painelTabuleiro = painel;
		first = new PrimeiroBloco(this.painelTabuleiro);
		second = new SegundoBloco();
		
		first.setPreferredSize(new Dimension(this.getWidth(), 350));
		this.setLayout(new GridLayout(5,1));
		verificar = new BotaoEsquerdo("Verificar");
		verificar.addActionListener(new Verificar());
		proxJogada = new BotaoEsquerdo("Próxima Jogada");
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
	
	public void salvarAluno(PainelTabuleiro p) {
		for (Celula celula : p.listaCelulas) {
			if(celula.getAluno() instanceof Aluno && celula.getRobo() instanceof Robo) {
				//celula.setAluno(null);
				celula.getRobo().encontrouAluno();
				if(celula.getRobo() instanceof Cavalo) {
					second.pontuacaoCavalo.setText(""+celula.getRobo().pontuacao);
				}else if(celula.getRobo() instanceof Bispo) {
					second.pontuacaoBispo.setText(""+celula.getRobo().pontuacao);
				}else if(celula.getRobo() instanceof Torre) {
					second.pontuacaoTorre.setText(""+celula.getRobo().pontuacao);
				}
				p.setAlunosEncontrados();
				first.imageAluno.setTotal(p.getAlunosEncontrados());
			}
		}
	}
	
	public void perderPontos(PainelTabuleiro p) {
		for (Celula celula : p.listaCelulas) {
			if(celula.getBug() instanceof Bug && celula.getRobo() instanceof Robo) {
				//celula.setBug(null);
				celula.getRobo().encontrouBug();
				if(celula.getRobo() instanceof Cavalo) {
					second.pontuacaoCavalo.setText(""+celula.getRobo().pontuacao);
				}else if(celula.getRobo() instanceof Bispo) {
					second.pontuacaoBispo.setText(""+celula.getRobo().pontuacao);
				}else if(celula.getRobo() instanceof Torre) {
					second.pontuacaoTorre.setText(""+celula.getRobo().pontuacao);
				}
				p.setBugsEncontrados();
				first.imageBug.setTotal(p.getBugsEncontrados());
			}
		}
	}
	
	public void somarPontos() {
		int total = Integer.parseInt(second.pontuacaoBispo.getText()) + Integer.parseInt(second.pontuacaoCavalo.getText()) + Integer.parseInt(second.pontuacaoTorre.getText());
		first.pontuacao.setText(""+total);
	}
	
	private class Verificar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
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
			
			File arquivo = new File("C:\\Users\\Antônio Cruz\\eclipse-workspace\\Dado.txt");
			try {
	            // Cria um objeto FileWriter com o caminho do arquivo
	            FileWriter escritor = new FileWriter(arquivo, false);

	            escritor.write("");

	            escritor.close();

	            System.out.println("Conteúdo Limpo com sucesso");

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
		}
	}
	
	private class ProxJogada implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//Adicionar imagem do aluno ou bug
			//tira o aluno ou bug da celula
			second.bispo.setEnabled(true);
			second.cavalo.setEnabled(true);
			second.torre.setEnabled(true);
			for (Celula celula : painelTabuleiro.listaCelulas) {
				if(celula.getBug() instanceof Bug && celula.getRobo() instanceof Robo) {
					celula.setBug(null);
					celula.button.setIcon(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\BUg.png"));
				}
				if(celula.getAluno() instanceof Aluno && celula.getRobo() instanceof Robo) {
					celula.setAluno(null);
					celula.button.setIcon(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\pessoinha.jpeg"));
				}
			}
		}
	}
}
