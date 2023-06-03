package visualizacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JPanel;

public class PainelCadastro extends JPanel{

	public PainelCadastro() {
		
		this.setBackground(Color.yellow);
		this.setLayout(new GridLayout(17, 2));
		this.add(new Label("Nome :"));
		this.add(new TextField());
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label("CPF :"));
		this.add(new TextField());
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label("Matricula :"));
		this.add(new TextField());
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label("Vertente :"));
		this.add(new TextField());
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Button("Cadastrar"));
		
	}
}
