package visualizacao.paineis;
import controller.Alunos;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import controller.Aluno;
import visualizacao.components.Button;
import visualizacao.components.Label;

public class PainelDelete extends JPanel{

	Button deletar;
	TextField matriculaDeletar;
	Alunos alunos;
	
	public PainelDelete() {
		deletar = new Button("Deletar");
		deletar.addActionListener(new ExecutarDeletar());
		matriculaDeletar = new TextField();
		alunos = new Alunos();
		
		this.setBackground(new Color(234,238,180));
		this.setLayout(new GridLayout(6, 2));
		this.add(new Label("Matricula :"));
		this.add(matriculaDeletar);
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(deletar);
		this.add(new Label(""));
	}
	
	private class ExecutarDeletar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String matricula = matriculaDeletar.getText();
		
			for (Aluno aluno : alunos.listaAlunos) {
				if(matricula.equals(aluno.getMatricula()))
					alunos.listaAlunos.remove(aluno);
			}
		}
	}
}
