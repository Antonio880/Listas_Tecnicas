package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import model.Jogador;

public class PainelSouth extends JPanel{
	
	public PainelTabuleiro tabuleiro;
	public PainelWest west;
	
	public PainelSouth(Jogador jogador) {
		this.setPreferredSize(new Dimension(900, 585));
		this.setLayout(new BorderLayout());
		tabuleiro = new PainelTabuleiro();
		west = new PainelWest(tabuleiro, jogador);
		west.setPreferredSize(new Dimension(280, 500));
		tabuleiro.setPreferredSize(new Dimension(600, 400));
		this.add(tabuleiro, BorderLayout.WEST);
		this.add(west, BorderLayout.EAST);
		
	}
}
