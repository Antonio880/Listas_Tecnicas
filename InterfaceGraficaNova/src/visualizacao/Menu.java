package visualizacao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame{
	
	Display display;
	PainelFundo painel;
	
	public Menu() {
		
		this.setSize(600, 600);
		this.setTitle("Gerenciador de Alunos");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.setBackground(new Color(234,238,180));
		
		painel = new PainelFundo();
		painel.setPreferredSize(new Dimension(this.getWidth(), 500));
		painel.setBackground(new Color(234,238,180));
		
		display = new Display();
		display.setPreferredSize(new Dimension(this.getWidth(), 50));
		
		display.cadastrar.addActionListener(new Cadastro());
		display.listar.addActionListener(new Lista());
		display.atualizar.addActionListener(new Atualizacao());
		display.deletar.addActionListener(new Deletar());
		
		this.add(display, BorderLayout.NORTH);
		this.add(painel, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	private class Cadastro implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(painel.painelCadastro.isVisible()) {
				painel.painelCadastro.setVisible(false);
			}else {
				painel.painelCadastro.setVisible(true);
				painel.setConteudoCadastrar();
			}
		}		
	}
	
	private class Lista implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(painel.painelListar.isVisible()) {
				painel.painelListar.setVisible(false);
			}else {
				painel.painelListar.setVisible(true);
				painel.setConteudoListar();
			}
		}
	}
	private class Atualizacao implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(painel.painelAtualizar.isVisible()) {
				painel.painelAtualizar.setVisible(false);
			}else {
				painel.painelAtualizar.setVisible(true);
				painel.setConteudoAtualizar();
			}
		}	
	}
	private class Deletar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(painel.painelDeletar.isVisible()) {
				painel.painelDeletar.setVisible(false);
			}else {
				painel.painelDeletar.setVisible(true);
				painel.setConteudoDeletar();
			}
		}	
	}
}
