package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import persistencia.*;

import views.JanelaFrame;

public class Controlador {
	public JanelaFrame janela;
	
	public Controlador(JanelaFrame janela) {
		this.janela = janela;
		
	}
	
	public void gerarRelatorioFinal() {
		janela.sul.west.verificarCelulasClicadasVazias(janela.sul.tabuleiro);   
		File arquivo = new File("C:\\Users\\Antônio Cruz\\eclipse-workspace\\GerarRelatorio.txt");
		try {
			FileWriter escritor = new FileWriter(arquivo, true);
			
			escritor.write(janela.norte.janelaNorte.jogador.getNome()+"; ");
			escritor.write(janela.norte.janelaNorte.jogador.rodada+"; ");
			escritor.write(janela.sul.west.first.pontuacao.getText()+"; ");
			escritor.write(janela.norte.janelaNorte.jogador.getCelulasNaoClicadas()+"; ");
			escritor.write(""+janela.sul.west.first.imageAluno.getTotal()+"; ");
			escritor.write(""+janela.sul.west.first.imageBug.getTotal()+"; ");
			escritor.write(janela.sul.west.second.pontuacaoCavalo.getText()+"; ");
			escritor.write(janela.sul.west.second.pontuacaoBispo.getText()+"; ");
			escritor.write(janela.sul.west.second.pontuacaoTorre.getText()+";");
			escritor.write("\n");
			
			escritor.close();

            System.out.println("Conteúdo Limpo com sucesso");
		}catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	
	
}
