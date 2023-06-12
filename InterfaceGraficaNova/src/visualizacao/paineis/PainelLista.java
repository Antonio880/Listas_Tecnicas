package visualizacao.paineis;

import javax.swing.*;
import java.awt.*;
import java.util.*;

import controller.Alunos;
import controller.Aluno;
import visualizacao.components.Label;
import javax.swing.table.DefaultTableModel;

public class PainelLista extends JPanel{
	
	public PainelLista(Alunos alunos) {
		
		String[] colunas = {"Nome", "CPF", "Matricula", "Vertente"};
		this.setBackground(new Color(234,238,180));
		this.setLayout(new FlowLayout());
		String[][] dados = {{"Antonio", "012003", "21321", "CC"}};
		
		DefaultTableModel tabelaModel = new DefaultTableModel(dados, colunas);
		
		JTable tabela = new JTable(tabelaModel);
		
		JScrollPane scroll = new JScrollPane(tabela);
		
		for (Aluno aluno : alunos.listaAlunos) {
			/*Object[] linha = {
				aluno.getNome() + " - " + aluno.getCpf() + " - " + aluno.getMatricula() + " - " + aluno.getVertente()
			};*/
			for (int i = 0; i < alunos.listaAlunos.size()/4; i++) {
				dados[i][0] = aluno.getNome();
				dados[i][1] = aluno.getCpf();
				dados[i][2] = aluno.getMatricula();
				dados[i][3] = aluno.getVertente();
			}
			//tabelaModel.addRow(linha);
		}
		
		this.add(scroll);
	}
}
