package exerc17;
import java.util.InputMismatchException;
import java.util.Scanner;
public abstract class JogoDaVelha {

	protected String[][] grade = new String[3][3];
	private Usuario usuario1;
	private Usuario usuario2;
	
	public JogoDaVelha(Usuario usuario1, Usuario usuario2) {
		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade.length; j++) {
				this.grade[i][j] = " ";
			}
		}
		this.usuario1 = usuario1;
		this.usuario2 = usuario2;
	}
	
	public void gradeJogo() {
		System.out.println(grade[0][0] + "|" + grade[0][1] + "|" + grade[0][2]);
		System.out.println("-----");
		System.out.println(grade[1][0] + "|" + grade[1][1] + "|" + grade[1][2]);
		System.out.println("-----");
		System.out.println(grade[2][0] + "|" + grade[2][1] + "|" + grade[2][2]);
	}
	
	
	public boolean verificarVitoriaX( String grade[][]) {
		if((grade[0][0] == "X" && grade[1][0] == "X"&& grade[2][0] == "X") || (grade[0][1] == "X" && grade[1][1] == "X"&& grade[2][1] == "X") || (grade[0][2] == "X" && grade[1][2] == "X"&& grade[2][2] == "X")) {
			usuario1.setVitorias(usuario1.getVitorias() + 1);
			System.out.println("Parabéns, O jogador " + usuario1.getNome() + "ganhou!! E atualmente esta com " +  usuario1.getVitorias() + " vitórias!!");
			return false;
		}else if((grade[0][0] == "X" && grade[1][1] =="X" && grade[2][2] == "X") || (grade[0][2] == "X" && grade[1][1] =="X" && grade[2][0] == "X")) {
			usuario1.setVitorias(usuario1.getVitorias() + 1);
			System.out.println("Parabéns, O jogador " + usuario1.getNome() + "ganhou!! E atualmente esta com " +  usuario1.getVitorias() + " vitórias!!");
			return false;
		}else {
			return true;
		}
	}
	
	public boolean verificarVitoriaO(String grade[][]) {
		if((grade[0][0] == "O" && grade[1][0] == "O" && grade[2][0] == "O") || (grade[0][1] == "O" && grade[1][1] == "O"&& grade[2][1] == "O") || (grade[0][2] == "O" && grade[1][2] == "O"&& grade[2][2] == "O")) {
			usuario2.setVitorias(usuario2.getVitorias() + 1);
			System.out.println("Parabéns, O jogador " + usuario2.getNome() + "ganhou!! E atualmente esta com " +  usuario2.getVitorias() + " vitórias!!");
			return false;
		}else if((grade[0][0] == "O" && grade[1][1] =="O" && grade[2][2] == "O") || (grade[0][2] == "O" && grade[1][1] =="O" && grade[2][0] == "O")) {
			usuario2.setVitorias(usuario2.getVitorias() + 1);
			System.out.println("Parabéns, O jogador " + usuario2.getNome() + "ganhou!! E atualmente esta com " +  usuario2.getVitorias() + " vitórias!!");
			return false;
		}else {
			return true;
		}
	}
	
	public boolean verificarX(String grade[][], int i, int j) {
		if(grade[i][j] == " " && i >= 0 && i <= 2 && j >= 0 && j <= 2) {
			grade[i][j] = "X";
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verificarO(String grade[][], int i, int j) {
		if(grade[i][j] == " " && i >= 0 && i <= 2 && j >= 0 && j <= 2) {
			grade[i][j] = "O";
			return true;
		}else {
			System.out.println("Algo de errado não está certo");
			return false;
		}
	}
}
