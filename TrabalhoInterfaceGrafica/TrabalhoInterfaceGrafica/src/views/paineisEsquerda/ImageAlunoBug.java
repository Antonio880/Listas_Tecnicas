package views.paineisEsquerda;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.Modelo;

public class ImageAlunoBug extends JLabel{

	private int total;
	
	public ImageAlunoBug(ImageIcon image){
		this.setIcon(image);
		this.setText("0");
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
		this.setText(""+total);
	}
}
