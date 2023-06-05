package visualizacao;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JPanel;

public class PainelDelete extends JPanel{

	public PainelDelete() {
		this.setBackground(new Color(234,238,180));
		this.setLayout(new GridLayout(6, 2));
		this.add(new Label("Matricula :"));
		this.add(new TextField());
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Button("Deletar"));
		this.add(new Label(""));
	}
}
