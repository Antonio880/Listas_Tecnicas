import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogo {

	private String nomeUser;
	private Plano plano;
	private boolean controle;
	private int alunosEncontrados, bugsOcorridos;
	private int numeroAlunos, numeroBugs;
	private ArrayList<Robo> listaRoboExistem;
	
	public Jogo() {
		controle = false;
		numeroAlunos = 0;
		numeroBugs = 0;
		boasVindas();
		autobotsRodar();
		listaRoboExistem = new ArrayList<Robo>();
	}
	
	public void boasVindas() {
		int x = 0, y =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Olá, digite seu nome:");
		this.nomeUser = input.nextLine();
		System.out.println("Seja Bem Vindo " + nomeUser + " ao jogo parecido com xadrez mas nao eh xadrez.");
		do {
			
			try {
				System.out.println("Digite o tamanho X:");
				x = input.nextInt();
				if(x < 4) {
					controle = true;
					System.out.println("Tamanho Invalido");
				}else {
					controle = false;
				}
			}catch(InputMismatchException e) {
				System.out.println("Tamanho Invalido!");
				controle = true;
				input.nextLine();
			}
		}while(controle);
		controle = false;
		do {
			try {
				System.out.println("Agora digite o tamanho Y:");
				y = input.nextInt();
				if(y < 7) {
					controle = true;
					System.out.println("Tamanho Invalido");
				}else {
					controle = false;
				}
			}catch(InputMismatchException e) {
				System.out.println("Tamanho Invalido!");
				controle = true;
				input.nextLine();
			}
		}while(controle);
		plano = new Plano(x, y);
	}
	
	public void grade() {
		for (Celula celula : plano.listaCelulas) {
			if(!celula.listaRobos.isEmpty()){
				System.out.print(celula.listaRobos.get(celula.listaRobos.size() - 1).tipo);
			}/*else if(celula.modelo != null) {
				if(celula.modelo instanceof Aluno)
					System.out.print(celula.modelo.tipo);
				if(celula.modelo instanceof Bug) 
					System.out.print(celula.modelo.tipo);
			}*/else 
				System.out.print(" * ");
			if(celula.posicaoYCelula % plano.tamanhoYPlano == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public void iniciarJogo() {
		Scanner input = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Digite o numero de alunos que deve ter no jogo:");
				numeroAlunos = input.nextInt();
				if(numeroAlunos > (plano.listaCelulas.size()/2)) { 
					controle = true;
					System.out.println("Tamanho Invalido");
				}else {
					controle = false;
				}
			}catch(InputMismatchException e) {
				System.out.println("Tamanho Invalido!");
				controle = true;
				input.nextLine();
			}
		}while(controle);
		controle = false;
		do {
			try {
				System.out.println("Digite o numero de bugs que deve ter no jogo:");
				numeroBugs = input.nextInt();
				if(numeroBugs > (plano.listaCelulas.size()/2)) { 
					controle = true;
					System.out.println("Tamanho Invalido");
				}else {
					controle = false;
				}
			}catch(InputMismatchException e) {
				System.out.println("Tamanho Invalido!");
				controle = true;
				input.nextLine();
			}
		}while(controle);
		
	}
	
	public void salvarAluno() {
		for (Celula celula : plano.listaCelulas) {
			for(Robo robo : celula.listaRobos) {
				if(celula.modelo instanceof Aluno && !celula.listaRobos.isEmpty()) {
					celula.modelo = null;
					robo.addPontos();
					alunosEncontrados++;
				}
			}
		}
	}
	
	public void encontrouBug() {
		for (Celula celula : plano.listaCelulas) {
			for(Robo robo : celula.listaRobos) {
				if(celula.modelo instanceof Aluno && !celula.listaRobos.isEmpty()) {
					robo.removePoints();
					bugsOcorridos++;
				}
			}
		}
	}
/*
 * Decidi colocar esse metodo salvarAluno no jogo, pois se colocar em cada robo ele irar executar toda vez que andar,
 * e assim não teria como um outro robo ganhar a pontuação se chegasse na mesma posição que chegou o anterior
 * */
	
	public boolean verificarExistenciaAluno() {
		for (Celula celula : plano.listaCelulas) {
			if(celula.modelo instanceof Aluno) {
				return true;
			}
		}
		return false;
	}
	
	public void autobotsRodar() {
		
		iniciarJogo();
		if (this.listaRoboExistem == null){
            this.listaRoboExistem = new ArrayList<Robo>();
        }
		Andador andador = new Andador(1, "Andador", plano.tamanhoXPlano, 1, plano);
		listaRoboExistem.add(andador);
		Bispo bispo = new Bispo(2, "Bispo", plano.tamanhoXPlano, 2, plano);
		listaRoboExistem.add(bispo);
		Cavalo cavalo = new Cavalo(3, "Cavalo", plano.tamanhoXPlano, 3, plano);
		listaRoboExistem.add(cavalo);
		Peao peao = new Peao(4, "Peao", plano.tamanhoXPlano, 4, plano);
		listaRoboExistem.add(peao);
		Rainha rainha = new Rainha(5, "Rainha", plano.tamanhoXPlano, 5, plano);
		listaRoboExistem.add(rainha);
		Rei rei = new Rei(6, "Rei", plano.tamanhoXPlano, 6, plano);
		listaRoboExistem.add(rei);
		Torre torre = new Torre(7, "Torre", plano.tamanhoXPlano, 7, plano);
		listaRoboExistem.add(torre);
		for(int i = 0; i < numeroAlunos; i++) {
			new Aluno(plano);
		}
		for(int i = 0; i < numeroBugs; i++) {
			new Bug(plano);
		}
		
		controle = true;
		System.out.println("Pronto, Agora vamos iniciar o Jogo");
		while(controle) {
			grade();
			
			if(direcaoAndada(andador).equals("AVANCAR")) {
				andador.Avancar(quantidadeAndada(andador));
			}else {
				andador.Retroceder(quantidadeAndada(andador));
			}
			
			if(direcaoAndada(bispo).equals("AVANCAR")) {
				bispo.Avancar(quantidadeAndada(bispo));
			}else {
				bispo.Retroceder(quantidadeAndada(bispo));
			}
			
			if(direcaoAndada(cavalo).equals("AVANCAR")) {
				cavalo.Avancar(quantidadeAndada(cavalo));
			}else {
				cavalo.Retroceder(quantidadeAndada(cavalo));
			}
			
			if(direcaoAndada(peao).equals("AVANCAR")) {
				peao.Avancar();
			}else {
				peao.Retroceder();
			}
			
			if(direcaoAndada(rainha).equals("AVANCAR")) {
				rainha.Avancar(quantidadeAndada(rainha));
			}else {
				rainha.Retroceder(quantidadeAndada(rainha));
			}
			
			if(direcaoAndada(rei).equals("AVANCAR")) {
				rei.Avancar(quantidadeAndada(rei));
			}else {
				rei.Retroceder(quantidadeAndada(rei));
			}
			
			if(direcaoAndada(torre).equals("AVANCAR")) {
				torre.Avancar(quantidadeAndada(torre));
			}else {
				torre.Retroceder(quantidadeAndada(torre));
			}
			
			salvarAluno();
			encontrouBug();
			
			grade();
			
			for (Robo robo : listaRoboExistem) {
				System.out.println("O(a) " + robo.nome + " tem " + robo.pontos + " pontos!");
			}
			
			controle = verificarExistenciaAluno();
		}
		
		System.out.println();
		System.out.println("----PARABENS!!Voce salvou todos os Alunos, Agora segue o anexo!----");
		System.out.println("O numero de Alunos salvos " + alunosEncontrados + " e o numero de bugs ocorridos foi " + bugsOcorridos + " !!");
		System.out.println();
	
		for (Robo robo : listaRoboExistem) {
			System.out.println("O(a) " + robo.nome + " tem " + robo.pontos + " pontos!");
			System.out.println("O(a) " + robo.nome + " andou pelas seguintes posicoes X: ");
			for(int i = 0; i < robo.celulasVisitadas.size(); i++) {
				System.out.println(robo.celulasVisitadas.get(i).posicaoXCelula);
			}
			System.out.println("O(a) " + robo.nome + " andou pelas seguintes posicoes Y: ");
			for(int i = 0; i < robo.celulasVisitadas.size(); i++) {
				System.out.println(robo.celulasVisitadas.get(i).posicaoYCelula);
			}
			
		}
		
		System.out.println();
		Robo roboGanhador = roboGanhador();
		System.out.println("O(a) Robo ganhador foi " + roboGanhador.nome + " e obteve a seguinte pontuacao: " + roboGanhador.pontos + " pontos e o jogador ganhador foi: " + nomeUser);
		
	}
	
	public int quantidadeAndada(Robo robo) {
		int quantidadeAndada = 0;
		controle = false;
		Scanner input = new Scanner(System.in);
		do {
			try {
				System.out.println("Quantas casas quer que o(a) " + robo.nome + " ande, lembrando que ele tem um maximo de " + robo.quantidadeMaxima + " casas para andar!");
				quantidadeAndada = input.nextInt();
				System.out.println();
				if(quantidadeAndada > robo.quantidadeMaxima || quantidadeAndada < 0) {
					controle = true;
				}else {
					controle = false;
				}
			}catch(InputMismatchException e) {
				System.out.println("Tamanho Invalido!");
				controle = true;
				input.nextLine();
			}
		}while(controle);
		return quantidadeAndada;
	}
	
	public String direcaoAndada(Robo robo) {
		String direcao;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Qual direcao quer que o(a) " + robo.nome + " ande");
			direcao = input.nextLine().toUpperCase();
			if(direcao.equals("AVANCAR") || direcao.equals("RETROCEDER")) {
				return direcao;
			}else {
				System.out.println("----DIRECAO INVALIDA----");
				controle = true;
			}
		}while(controle);
		return null;
	}
	
	public Robo roboGanhador() {
		int maior = listaRoboExistem.get(0).pontos;
		for (Robo robo : listaRoboExistem) {
			if(maior < robo.pontos)
				maior = robo.pontos;
		}
		for (Robo robo : listaRoboExistem) {
			if(maior == robo.pontos)
				return robo;
		}
		return null;
	}
}
