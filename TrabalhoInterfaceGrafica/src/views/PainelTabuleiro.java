package views;
import model.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PainelTabuleiro extends JPanel{
	
	public ArrayList<Celula> listaCelulas;
	private int alunosEncontrados;
	private int BugsEncontrados;
	
	public PainelTabuleiro() {
		
		listaCelulas = new ArrayList<Celula>();
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(new BorderLayout());
		JPanel painel1 = new JPanel();
		
		painel1.setLayout(new GridLayout(8,8));
		
		for (int i = 0; i < 8; i++) {
			  for (int j = 0; j < 8; j++) {
				  Celula celula = new Celula(i,j);
				  listaCelulas.add(celula);
				  
				  if ((i + j) % 2 == 0) {
					  celula.button.setBackground(Color.white);
					  adicionarAleatoriamenteAlunoEBug(celula);
					  celula.button.setBorderPainted(false);
					  mostrarAlunoBug(celula);
					  painel1.add(celula.button);
	              }else {
	            	  celula.button.setBackground(Color.black);
	            	  adicionarAleatoriamenteAlunoEBug(celula);
	            	  celula.button.setBorderPainted(false);
	            	  mostrarAlunoBug(celula);
	            	  painel1.add(celula.button);
	              }
	          }
			}
		 this.add(painel1, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public void setAlunosEncontrados() {
		this.alunosEncontrados++;
	}

	public void setBugsEncontrados() {
		BugsEncontrados++;
	}

	public int getAlunosEncontrados() {
		return alunosEncontrados;
	}

	public int getBugsEncontrados() {
		return BugsEncontrados;
	}

	public void mostrarAlunoBug(Celula celula) {
		if(celula.getAluno() instanceof Aluno) {
			celula.button.setIcon(celula.getAluno().getImageAluno());
		}else if(celula.getBug() instanceof Bug){
			celula.button.setIcon(celula.getBug().getImage());
		}
	}
	
	public void adicionarAleatoriamenteAlunoEBug(Celula celula) {
	    Random random = new Random();
	    
	    if (random.nextDouble() < 0.3) {
	    	celula.setAluno(new Aluno());
	    } else if (random.nextDouble() < 0.2) {
	        celula.setBug(new Bug());
	    }
	}
	
}