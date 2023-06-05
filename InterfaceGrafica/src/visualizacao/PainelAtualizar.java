package visualizacao;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.JLabel;

import javax.swing.JPanel;

public class PainelAtualizar extends JPanel{

	public PainelAtualizar() {
		this.setBackground(new Color(234,238,180));
		this.setLayout(new GridLayout(10, 2));
		this.add(new Label("Matricula :"));
		this.add(new TextField());
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label("Vertente :"));
		this.add(new TextField());
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Button("Atualizar"));
		this.add(new Label(""));
	}
}
