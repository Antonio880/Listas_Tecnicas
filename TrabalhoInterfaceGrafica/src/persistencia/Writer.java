package persistencia;

import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;

public class Writer {

	public void escreverDados(String file, String mensagem) {
		
		File arquivo = new File(file);
		try {
			FileWriter escritor = new FileWriter(arquivo, true);
			escritor.write(mensagem);
			escritor.write("\n");
			escritor.close();
		} catch (Exception e) {
			
		}
	}
}
