package views;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JanelaFrame extends JFrame{

	PainelFundoNorth norte;
	PainelSouth sul;
	
	public JanelaFrame() {
		
		this.setSize(900, 700);
		this.setTitle("Minha primeira Janela- Ola mundo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		norte = new PainelFundoNorth();
		sul = new PainelSouth();
		
		norte.janelaNorte.jogar.addActionListener(new Jogar());
		sul.west.sair.addActionListener(new Sair());
		sul.setVisible(false);
		
		this.add(norte, BorderLayout.NORTH);
		this.add(sul, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	private class Jogar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(sul.isVisible()) {
				sul.setVisible(false);
			}else if(!sul.isVisible() && !norte.janelaNorte.nomeJogador.getText().equals("")) {
				sul.setVisible(true);
				norte.janelaNorte.nomeJogador.setEnabled(false);
				norte.janelaNorte.jogar.setEnabled(false);
				JOptionPane.showMessageDialog(null, "Nome cadastrado com sucesso!");
			}else if(!sul.isVisible() && norte.janelaNorte.nomeJogador.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Digite Um Nome!");
			}
		}
	}
	
	private class Sair implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			getRootPane().getParent().setVisible(false); // fecha a janela
            dispose(); // libera recursos
            System.exit(0); // encerra o programa
		}
		
	}
	
}
