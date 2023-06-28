package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Jogador;

public class JanelaNorth extends JPanel{

	public TextField nomeJogador;
	public JButton jogar;
	public JButton relatorio;
	public Jogador jogador;
	
	public JanelaNorth() {
		jogador = new Jogador();
		nomeJogador = new TextField();
		nomeJogador.setPreferredSize(new Dimension(150,30));
		jogar = criarBotao("Jogar");
		relatorio = criarBotao("Gerar Relatório");;
		JLabel label = new JLabel("Nome do Jogador");
		
		label.setPreferredSize(new Dimension(125,25));
		this.setBackground(new Color(124, 163, 255));
		this.setLayout(new FlowLayout());
		jogar.addActionListener(new NomeJogador());
		
		this.add(label);
		this.add(nomeJogador);
		this.add(jogar);
		this.add(relatorio);
	}
	
	public JButton criarBotao(String text) {
		JButton b = new JButton(text);
		b.setBackground(new Color(68, 123, 253));
		b.setPreferredSize(new Dimension(150, 40));
		return b;
	}
	
	private class NomeJogador implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			jogador.setNome(nomeJogador.getText());
			System.out.println(jogador.getNome());
			
		}
		
	}
}

