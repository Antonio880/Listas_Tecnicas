package visualizacao.paineis;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import javax.swing.JPanel;

import controller.Aluno;
import controller.Alunos;
import visualizacao.components.Button;
import visualizacao.components.Label;

public class PainelAtualizar extends JPanel{

	Button atualizar;
	TextField matriculaAtualizar;
	TextField vertenteAtualizar;
	Alunos alunos;
	
	public PainelAtualizar() {
		atualizar = new Button("Atualizar");
		atualizar.addActionListener(new ExecutarAtualizacao());
		matriculaAtualizar = new TextField();
		vertenteAtualizar = new TextField();
		alunos = new Alunos();
		
		this.setBackground(new Color(234,238,180));
		this.setLayout(new GridLayout(10, 2));
		this.add(new Label("Matricula :"));
		this.add(matriculaAtualizar);
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label("Vertente :"));
		this.add(vertenteAtualizar);
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(atualizar);
		this.add(new Label(""));
	}
	
	private class ExecutarAtualizacao implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String matricula = matriculaAtualizar.getText();
		
			for (Aluno aluno : alunos.listaAlunos) {
				if(matricula.equals(aluno.getMatricula()))
					aluno.setVertente(vertenteAtualizar.getText());
			}
		}
	}
}
