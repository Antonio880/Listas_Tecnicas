package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelSouth extends JPanel{
	
	PainelTabuleiro tabuleiro;
	PainelWest west;
	
	public PainelSouth() {
		this.setPreferredSize(new Dimension(900, 585));
		this.setLayout(new BorderLayout());
		tabuleiro = new PainelTabuleiro();
		west = new PainelWest(tabuleiro);
		west.setPreferredSize(new Dimension(280, 500));
		tabuleiro.setPreferredSize(new Dimension(600, 400));
		this.add(tabuleiro, BorderLayout.WEST);
		this.add(west, BorderLayout.EAST);
		
	}
	
	/*private class CliqueTabuleiro implements ActionListener{

		PainelTabuleiro tabuleiro;
		PainelWest west;
		String tipoClicado;
		
		public CliqueTabuleiro(PainelTabuleiro tabuleiro, PainelWest west) {
			this.tabuleiro = tabuleiro;
			this.west = west;
		}
		
		public void actionPerformed(ActionEvent e) {
		}
	}*/
	
}
