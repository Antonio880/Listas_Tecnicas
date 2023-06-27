package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Jogador;

public class PainelFundoNorth extends JPanel{

	public JanelaNorth janelaNorte;
	
	public PainelFundoNorth() {
	
		this.setPreferredSize(new Dimension(900, 75));
		this.setBackground(new Color(124, 163, 255));
		this.setLayout(new BorderLayout());
		janelaNorte = new JanelaNorth();
		this.add(janelaNorte, BorderLayout.CENTER);
	
	}
}
