package visualizacao;

import java.awt.Dimension;

import javax.swing.JPanel;

import controller.Alunos;
import visualizacao.paineis.PainelAtualizar;
import visualizacao.paineis.PainelCadastro;
import visualizacao.paineis.PainelDelete;
import visualizacao.paineis.PainelLista;

public class PainelFundo extends JPanel{

	PainelCadastro painelCadastro;
	PainelAtualizar painelAtualizar;
	PainelLista painelListar;
	PainelDelete painelDeletar;
	
	public PainelFundo() {
		painelCadastro = new PainelCadastro();
		painelAtualizar = new PainelAtualizar();
		painelListar = new PainelLista(painelCadastro.alunos);
		painelDeletar = new PainelDelete();
	}
	
	public void setConteudoCadastrar() {
		painelCadastro.setPreferredSize(new Dimension(this.getWidth() - 100, this.getHeight() - 50));
		this.removeAll();
		this.add(painelCadastro);
		this.revalidate(); 
		this.repaint();
	}
	
	public void setConteudoAtualizar() {
		painelAtualizar.setPreferredSize(new Dimension(this.getWidth() - 100, this.getHeight() - 225));
		this.removeAll();
		this.add(painelAtualizar);
		this.revalidate(); 
		this.repaint();
	}
	
	public void setConteudoListar() {
		painelListar.setPreferredSize(new Dimension(this.getWidth() - 130, this.getHeight() - 50));
		this.removeAll();
		this.add(painelListar);
		this.revalidate(); 
		this.repaint();
	}
	
	public void setConteudoDeletar() {
		painelDeletar.setPreferredSize(new Dimension(this.getWidth() - 100, this.getHeight() - 350));
		this.removeAll();
		this.add(painelDeletar);
		this.revalidate(); 
		this.repaint();
	}
}
