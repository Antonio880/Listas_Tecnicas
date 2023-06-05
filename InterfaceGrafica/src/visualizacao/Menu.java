package visualizacao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame{
	
	Display display;
	PainelFundo painel;
	PainelCadastro cadastro;
	PainelLista lista;
	
	public Menu() {
		
		this.setSize(600, 600);
		this.setTitle("Gerenciador de Alunos");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.setBackground(new Color(234,238,180));
		
		cadastro = new PainelCadastro();
		cadastro.setVisible(false);
		
		lista = new PainelLista();
		lista.setVisible(false);
		
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
			painel.setConteudoCadastrar();
		}		
	}
	
	private class Lista implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			painel.setConteudoListar();
		}
	}
	private class Atualizacao implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			painel.setConteudoAtualizar();
		}		
	}
	private class Deletar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			painel.setConteudoDeletar();
		}		
	}
}
