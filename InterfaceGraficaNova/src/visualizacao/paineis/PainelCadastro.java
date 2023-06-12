package visualizacao.paineis;
import controller.Alunos;
import controller.Aluno;
import visualizacao.components.Button;
import visualizacao.components.Label;

import java.awt.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PainelCadastro extends JPanel{

	Button cadastrar;
	TextField nomeCadastro;
	TextField cpfCadastro;
	TextField matriculaCadastro;
	TextField vertenteCadastro;
	public Alunos alunos;
	
	public PainelCadastro() {
		cadastrar = new Button("Cadastrar");
		cadastrar.addActionListener(new ExecutarCadastro());
		nomeCadastro = new TextField();
		cpfCadastro = new TextField();
		matriculaCadastro = new TextField();
		vertenteCadastro = new TextField();
		alunos = new Alunos();
		
		this.setBackground(new Color(234,238,180));
		this.setLayout(new GridLayout(17, 2));
		this.add(new Label("Nome :"));
		this.add(nomeCadastro);
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label("CPF :"));
		this.add(cpfCadastro);
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label("Matricula :"));
		this.add(matriculaCadastro);
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label("Vertente :"));
		this.add(vertenteCadastro);
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(new Label(""));
		this.add(cadastrar);
	}
	
	private class ExecutarCadastro implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			Aluno aluno = new Aluno();
			aluno.setNome(nomeCadastro.getText());
			aluno.setCpf(cpfCadastro.getText());
			aluno.setMatricula(matriculaCadastro.getText());
			aluno.setVertente(vertenteCadastro.getText().toUpperCase());
			nomeCadastro.setText("");
			cpfCadastro.setText("");
			matriculaCadastro.setText("");
			vertenteCadastro.setText("");
			alunos.listaAlunos.add(aluno);
		}
	}
}


