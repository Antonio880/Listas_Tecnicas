package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.*;

public class Read {
	public ArrayList<String> ReadArquivo(ArrayList<String> linhas) {
		
		try {
			FileReader leitorArquivo = new FileReader("C:\\Users\\Antônio Cruz\\eclipse-workspace\\Dado.txt");
	
	        BufferedReader leitor = new BufferedReader(leitorArquivo);
	
	        String linhaArquivo;
	        while ((linhaArquivo = leitor.readLine()) != null) {
	        	linhas.add(linhaArquivo);
	        }
	        
	        leitor.close();
	        leitorArquivo.close();
	        
		}catch (IOException e1) {
	        System.out.println("Ocorreu um erro ao ler o arquivo: " + e1.getMessage());
	    }
		return linhas;
	}
}
