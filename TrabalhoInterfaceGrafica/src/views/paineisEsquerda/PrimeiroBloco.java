package views.paineisEsquerda;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.*;
import views.PainelTabuleiro;
public class PrimeiroBloco extends JPanel{

	public JLabel pontuacao;
	public ImageAlunoBug imageAluno;
	public ImageAlunoBug imageBug;
	PainelTabuleiro painel;
	
	public PrimeiroBloco(PainelTabuleiro p) {
		this.setLayout(new GridLayout(2,3));
		this.painel = p;
		
		pontuacao = new JLabel("0");
		imageAluno = new ImageAlunoBug(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\pessoinha.jpg"));
		imageBug = new ImageAlunoBug(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\BUg.png"));
		
		this.add(criarLabel("Pontuação"));
		this.add(new JLabel("  "));
		this.add(pontuacao);
		
		this.add(criarLabel("Total"));
		this.add(imageAluno);
		this.add(imageBug);
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setVisible(true);
	}
	
	public JLabel criarLabel(String text) {
		JLabel l = new JLabel(text);
		l.setPreferredSize(new Dimension(120, 40));
		return l;
	}
}
