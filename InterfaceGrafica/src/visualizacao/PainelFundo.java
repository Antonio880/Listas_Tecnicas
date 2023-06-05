package visualizacao;

import java.awt.Dimension;

import javax.swing.JPanel;

public class PainelFundo extends JPanel{

	
	public void setConteudoCadastrar() {
		PainelCadastro painel = new PainelCadastro();
		painel.setPreferredSize(new Dimension(this.getWidth() - 100, this.getHeight() - 50));
		this.removeAll();
		this.add(painel);
		this.revalidate(); 
		this.repaint();
	}
	
	public void setConteudoAtualizar() {
		PainelAtualizar painel = new PainelAtualizar();
		painel.setPreferredSize(new Dimension(this.getWidth() - 100, this.getHeight() - 225));
		this.removeAll();
		this.add(painel);
		this.revalidate(); 
		this.repaint();
	}
	
	public void setConteudoListar() {
		PainelLista painel = new PainelLista();
		painel.setPreferredSize(new Dimension(this.getWidth() - 285, this.getHeight() - 50));
		this.removeAll();
		this.add(painel);
		this.revalidate(); 
		this.repaint();
	}
	
	public void setConteudoDeletar() {
		PainelDelete painel = new PainelDelete();
		painel.setPreferredSize(new Dimension(this.getWidth() - 100, this.getHeight() - 350));
		this.removeAll();
		this.add(painel);
		this.revalidate(); 
		this.repaint();
	}
}
