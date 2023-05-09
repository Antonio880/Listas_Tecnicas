package exerc17;
import java.util.Scanner;
public class JogoDaVelha {

	private String[][] grade = new String[3][3];
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
	
	public void Jogo() {
		Scanner input = new Scanner(System.in);
		boolean controle = true;
		int listagem = 0;

		System.out.println("Seja Bem-Vindo " + usuario1.getNome() + " e " + usuario2.getNome() + " ao Jogo da Velha");
		System.out.println();
		System.out.println("Agora vamos começar a partida!");
		System.out.println();
		System.out.println();

		do {
			gradeJogo();
			if(verificarVitoriaX(grade) && verificarVitoriaO(grade)) {		

				do {
					if(listagem < 9) {
						System.out.println();
						System.out.println("Digite a posição que deseja colocar o X");
						int i = input.nextInt();
						int j = input.nextInt();
						controle = verificarX(grade, i, j);
						listagem++;
					}else {
						System.out.println("Deu Velha!");
						controle = false;
					}
				}while(!controle);

				if(listagem == 9 && verificarVitoriaX(grade) && verificarVitoriaO(grade)) {
					System.out.println("Deu Velha!");
					return;
				}

				do {
					if(listagem < 9) {
						System.out.println();
						System.out.println("Digite a posição que deseja colocar o O");
						int i = input.nextInt();
						int j = input.nextInt();
						controle = verificarO(grade,i,j);
						listagem++;
					}else {
						System.out.println("Deu Velha!");
						controle = false;
					}
				}while(!controle);

				if(listagem == 9 && verificarVitoriaX(grade) && verificarVitoriaO(grade)) {
					System.out.println("Deu Velha!");
					return;
				}
			}else {
				controle = false;
			}
		}while(controle);
	}
	
	
	public boolean verificarVitoriaX( String grade[][]) {
		if((grade[0][0] == "X" && grade[1][0] == "X"&& grade[2][0] == "X") || (grade[0][1] == "X" && grade[1][1] == "X"&& grade[2][1] == "X") || (grade[0][2] == "X" && grade[1][2] == "X"&& grade[2][2] == "X")) {
			System.out.println("Parabéns, O jogador " + usuario1.getNome() + "ganhou!!");
			return false;
		}else if((grade[0][0] == "X" && grade[1][1] =="X" && grade[2][2] == "X") || (grade[0][2] == "X" && grade[1][1] =="X" && grade[2][0] == "X")) {
			System.out.println("Parabéns, O jogador " + usuario1.getNome() + "ganhou!!");
			return false;
		}else {
			return true;
		}
	}
	
	public boolean verificarVitoriaO(String grade[][]) {
		if((grade[0][0] == "O" && grade[1][0] == "O" && grade[2][0] == "O") || (grade[0][1] == "O" && grade[1][1] == "O"&& grade[2][1] == "O") || (grade[0][2] == "O" && grade[1][2] == "O"&& grade[2][2] == "O")) {
			System.out.println("Parabéns, O jogador " + usuario2.getNome() + "ganhou!!");
			return false;
		}else if((grade[0][0] == "O" && grade[1][1] =="O" && grade[2][2] == "O") || (grade[0][2] == "O" && grade[1][1] =="O" && grade[2][0] == "O")) {
			System.out.println("Parabéns, O jogador " + usuario2.getNome() + "ganhou!!");
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
	
	public boolean verificarEmpate(String grade[][], boolean controle) {
		for (int i = 0; i < grade.length; i++) {
			for (int j = 0; j < grade.length; j++) {
				if(grade[i][j] == " ") {
					controle = true;
				}else {
					controle = false;
				}
			}
		}
		if(controle = false) {
			return false;
		}else {
			return true;
		}
	}
}
