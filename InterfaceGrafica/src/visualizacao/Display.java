package visualizacao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Display extends JPanel{
	
	Button cadastrar;
	Button listar;
	Button atualizar;
	Button deletar;

	public Display() {
		
		this.setBackground(new Color(220,228,170));
		this.setLayout(new FlowLayout());
		
		cadastrar = new Button("Cadastrar");
		this.add(cadastrar);
		
		listar = new Button("Listar");
		this.add(listar);
		
		atualizar = new Button("Atualizar");
		this.add(atualizar);
		
		deletar = new Button("Deletar");
		this.add(deletar);
	}
	
	
}
