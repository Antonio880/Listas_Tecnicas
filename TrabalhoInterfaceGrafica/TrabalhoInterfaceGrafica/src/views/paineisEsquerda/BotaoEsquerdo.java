package views.paineisEsquerda;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;

public class BotaoEsquerdo extends JButton{
	
	String tipo;
	public BotaoEsquerdo(String texto) {
		this.setText(texto);
		this.setBackground(new Color(68, 123, 253));
		this.tipo = texto;
		
	}
	
}
