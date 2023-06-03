package visualizacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PainelLista extends JPanel{

	public PainelLista() {
		this.setBackground(Color.yellow);
		this.setLayout(new BorderLayout());
		this.add(new Label("Colocar a tabela aqui com todos os dados dos alunos"), BorderLayout.CENTER);
	}
}
