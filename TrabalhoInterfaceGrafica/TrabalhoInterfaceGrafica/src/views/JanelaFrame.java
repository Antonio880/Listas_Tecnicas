package views;

import model.Controlador;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Jogador;

public class JanelaFrame extends JFrame{

	public PainelFundoNorth norte;
	public PainelSouth sul;
	public Controlador controller;
	
	public JanelaFrame() {
		
		this.setSize(900, 700);
		this.setTitle("Minha primeira Janela- Ola mundo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		controller = new Controlador(this);
		norte = new PainelFundoNorth();
		sul = new PainelSouth(norte.janelaNorte.jogador);
		norte.janelaNorte.relatorio.addActionListener(new GerarRelatorio());
		norte.janelaNorte.jogar.addActionListener(new Jogar());
		sul.west.sair.addActionListener(new Sair());
		sul.setVisible(false);
		
		this.add(norte, BorderLayout.NORTH);
		this.add(sul, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	private class Jogar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(sul.isVisible()) {
				sul.setVisible(false);
			}else if(!sul.isVisible() && !norte.janelaNorte.nomeJogador.getText().equals("")) {
				sul.setVisible(true);
				norte.janelaNorte.nomeJogador.setEnabled(false);
				norte.janelaNorte.jogar.setEnabled(false);
				JOptionPane.showMessageDialog(null, "Bem Vindo "+ norte.janelaNorte.nomeJogador.getText() + ", ao Jogo parecido com xadrez");
			}else if(!sul.isVisible() && norte.janelaNorte.nomeJogador.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Digite Um Nome!");
			}
		}
	}
	
	private class Sair implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			sul.west.verificarCelulasClicadasVazias(sul.tabuleiro);
			
			StringBuilder mensagem = new StringBuilder();
            mensagem.append("Relatório do Jogo\n\n");
            mensagem.append("Nome: " + norte.janelaNorte.jogador.getNome()+"\n");
            mensagem.append("Rodadas: " + norte.janelaNorte.jogador.rodada+"\n");
            mensagem.append("Pontuação Total: " + sul.west.first.pontuacao.getText()+"\n");
            mensagem.append("Células: " + norte.janelaNorte.jogador.getCelulasNaoClicadas()+"\n");
            mensagem.append("Alunos Resgatados: "+sul.west.first.imageAluno.getTotal()+"\n");
            mensagem.append("Bugs Encontrados: "+sul.west.first.imageBug.getTotal()+"\n");
            mensagem.append("Cavalo: " + sul.west.second.pontuacaoCavalo.getText()+"\n");
            mensagem.append("Bispo: " + sul.west.second.pontuacaoBispo.getText()+"\n");
            mensagem.append("Torre: " + sul.west.second.pontuacaoTorre.getText());
            
            getRootPane().getParent().setVisible(false);
            dispose();
            
            JOptionPane.showMessageDialog(null, mensagem.toString(), "Relatório Final", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	private class GerarRelatorio implements ActionListener{
		 
		public void actionPerformed(ActionEvent e) {

			controller.gerarRelatorioFinal();
		}
		
	}
}
