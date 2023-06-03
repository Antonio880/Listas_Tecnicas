package visualizacao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame{
	
	Display display;
	JPanel painelFundo;
	PainelCadastro cadastro;
	PainelLista lista;
	
	public Menu() {
		
		this.setSize(600, 600);
		this.setTitle("Servidor");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.setBackground(Color.white);
		
		cadastro = new PainelCadastro();
		cadastro.setVisible(false);
		
		lista = new PainelLista();
		lista.setVisible(false);
		
		display = new Display();
		display.setSize(200, 600);
		
		painelFundo = new JPanel();
		painelFundo.setBackground(Color.yellow);
		painelFundo.setLayout(new BorderLayout());
		painelFundo.setSize(400, 600);
		
		display.cadastrar.addActionListener(new Cadastro());
		display.listar.addActionListener(new Lista());
		
		this.add(cadastro, BorderLayout.CENTER);
		this.add(lista, BorderLayout.CENTER);
		
		this.add(display, BorderLayout.NORTH);
		this.add(painelFundo, BorderLayout.CENTER);
		
		
		this.setVisible(true);
	}
	
	private class Cadastro implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(cadastro.isVisible())
				cadastro.setVisible(false);
			else
				cadastro.setVisible(true);
		}
	}
	
	private class Lista implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(lista.isVisible()) {
				//cadastro.setVisible(false);
				lista.setVisible(false);
			}else{
				cadastro.setVisible(false);
				lista.setVisible(true);
			}
		}
		
		
	}
}
