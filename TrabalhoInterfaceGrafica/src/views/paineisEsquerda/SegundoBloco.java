package views.paineisEsquerda;
import views.PainelTabuleiro;
import views.paineisEsquerda.BotaoPecas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

import javax.swing.*;

public class SegundoBloco extends JPanel{

	public JLabel pontuacaoCavalo;
	public JLabel pontuacaoBispo;
	public JLabel pontuacaoTorre;
	public BotaoPecas cavalo;
	public BotaoPecas bispo;
	public BotaoPecas torre;
	
	public SegundoBloco() {
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(2,3));
		
		pontuacaoCavalo = new JLabel(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\CavaloAtual.jpg"));
		pontuacaoCavalo.setText("0");
		pontuacaoBispo = new JLabel(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\Bispo.jpg"));
		pontuacaoBispo.setText("0");
		pontuacaoTorre = new JLabel(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\TorreAtual-removebg-preview.png"));
		pontuacaoTorre.setText("0");
		
		cavalo = new BotaoPecas(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\CavaloAtual.jpg"), "cavalo");
		bispo = new BotaoPecas(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\Bispo.jpg"), "bispo");
		torre = new BotaoPecas(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\TorreAtual-removebg-preview.png"), "torre");
		
		this.add(pontuacaoCavalo);
		this.add(pontuacaoBispo);
		this.add(pontuacaoTorre);
		
		this.add(cavalo);
		this.add(bispo);
		this.add(torre);
		
		this.setVisible(true);
	}
	
	
}
