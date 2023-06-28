package views.paineisEsquerda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import model.Robo;
import views.PainelSouth;

public class BotaoPecas extends JButton{
	
	String tipo;
	public boolean verificar = true;
	

	public BotaoPecas(ImageIcon imagem, String tipo) {
		this.setIcon(imagem);
		this.tipo = tipo;
		this.addActionListener(new ClicouBotao(this));
		
	}
	
	private class ClicouBotao implements ActionListener{

		BotaoPecas button;
		String dado;
		
		
		public ClicouBotao(BotaoPecas button) {
			this.button = button;
		}
		public void actionPerformed(ActionEvent e) {
			if(verificar) {
				verificar = false;
			}
			button.setEnabled(false);
			dado = button.tipo;
			File arquivo = new File("C:\\Users\\Antônio Cruz\\eclipse-workspace\\Dado.txt");
			
			try {
				FileWriter escritor;
			
				escritor = new FileWriter(arquivo, true);
				escritor.write(dado);
				escritor.write("\n");
                escritor.close();

                System.out.println("Dados salvos com sucesso no arquivo.");
            } catch (IOException ex) {
                System.out.println("Ocorreu um erro ao salvar os dados no arquivo: " + ex.getMessage());
            }
		}
	}
}


