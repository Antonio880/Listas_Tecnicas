package views;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class BotaoTabuleiro extends JButton{

	private boolean botaoClicado = true;
	private String tipo;
	public ArrayList<String> linhas;
	
	public BotaoTabuleiro() {
		this.setPreferredSize(new Dimension(30,30));
		this.addActionListener(new Clicado(this));
		this.tipo = "";
		linhas = new ArrayList<String>();
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	private class Clicado implements ActionListener{
		
		BotaoTabuleiro button;
		
		public Clicado(BotaoTabuleiro botao) {
			this.button = botao; 
			
		}
		
		public void actionPerformed(ActionEvent e) {
			if(botaoClicado) {
				botaoClicado = false;
				button.setEnabled(false);
				//button.setBackground(Color.lightGray);
			}
			try {
	            FileReader leitorArquivo = new FileReader("C:\\Users\\Antônio Cruz\\eclipse-workspace\\Dado.txt");

	            BufferedReader leitor = new BufferedReader(leitorArquivo);

	            String linhaArquivo;
	            while ((linhaArquivo = leitor.readLine()) != null) {
	            	linhas.add(linhaArquivo);
	            }

	            leitor.close();
	            leitorArquivo.close();
	        } catch (IOException e1) {
	            System.out.println("Ocorreu um erro ao ler o arquivo: " + e1.getMessage());
	        }
			for (String string : linhas) {
				if(string.equals("cavalo")) {
					button.setTipo(string);
					button.setIcon(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\CavaloAtual.jpg"));	
				}else if(string.equals("bispo")) {
					button.setTipo(string);
					button.setIcon(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\Bispo.jpg"));	
				}else if(string.equals("torre")) {
					button.setTipo(string);
					button.setIcon(new ImageIcon("C:\\Users\\Antônio Cruz\\eclipse-workspace\\TrabalhoInterfaceGrafica\\src\\views\\TorreAtual-removebg-preview.png"));	
				}
			}
		}
	}
}
