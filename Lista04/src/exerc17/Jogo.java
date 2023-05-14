package exerc17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogo extends JogoDaVelha{
	
	
	public Jogo(Usuario usuario1, Usuario usuario2) {
		super(usuario1, usuario2);
		
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
}
