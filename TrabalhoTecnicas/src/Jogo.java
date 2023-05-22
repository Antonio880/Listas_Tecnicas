import java.util.Scanner;

public class Jogo {

	private String nomeUser;
	private Plano plano;
	private boolean controle;
	private int numeroAlunos, numeroBugs;
	
	public Jogo() {
		controle = false;
		numeroAlunos = 0;
		numeroBugs = 0;
		boasVindas();
		autobotsRodar();
	}
	
	public void boasVindas() {
		int x, y;
		Scanner input = new Scanner(System.in);
		System.out.println("Olá, digite seu nome:");
		this.nomeUser = input.nextLine();
		System.out.println("Seja Bem Vindo " + nomeUser + " ao jogo parecido com xadrez mas nao eh xadrez.");
		do {
			System.out.println("Digite o tamanho X:");
			x = input.nextInt();
			if(x < 4) {
				controle = true;
				System.out.println("Tamanho Invalido");
			}
		}while(controle);
		controle = false;
		do {
			System.out.println("Agora digite o tamanho Y:");
			y = input.nextInt();
			if(y < 7) {
				controle = true;
				System.out.println("Tamanho Invalido");
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
			System.out.println("Digite o numero de alunos que deve ter no jogo:");
			numeroAlunos = input.nextInt();
			if(numeroAlunos > (plano.listaCelulas.size()/2)) { 
				controle = true;
				System.out.println("Tamanho Invalido");
			}
		}while(controle);
		controle = false;
		do {
			System.out.println("Digite o numero de bugs que deve ter no jogo:");
			numeroBugs = input.nextInt();
			if(numeroBugs > (plano.listaCelulas.size()/2)) { 
				controle = true;
				System.out.println("Tamanho Invalido");
			}
		}while(controle);
		
	}
	
	public void salvarAluno() {
		/*Celula novaCelula = plano.retornarCelula(x, y);
		if(novaCelula.modelo instanceof Aluno && novaCelula != null) {
			novaCelula.modelo = null;
		}*/
		for (Celula celula : plano.listaCelulas) {
			for(Robo robo : celula.listaRobos) {
				if(celula.modelo instanceof Aluno && !celula.listaRobos.isEmpty()) {
					celula.modelo = null;
					robo.addPontos();
				}
			}
		}
	}
	
	public void encontrouBug() {
		for (Celula celula : plano.listaCelulas) {
			for(Robo robo : celula.listaRobos) {
				if(celula.modelo instanceof Aluno && !celula.listaRobos.isEmpty()) {
					robo.removePoints();
				}
			}
		}
	}
/*
 * Decidi colocar esse metodo salvarAluno no jogo, pois se colocar em cada robo ele irar executar toda vez que andar,
 * e assim não teria como um outro robo ganhar a pontuação se chegasse na mesma posição que chegou o anterior
 * */
	
	/*public boolean verificarExistenciaAluno() {
		
	}*/
	
	public void autobotsRodar() {
		
		iniciarJogo();
		
		Andador andador = new Andador(1, "Andador", plano.tamanhoXPlano, 1, plano);
		Bispo bispo = new Bispo(2, "Bispo", plano.tamanhoXPlano, 2, plano);
		Cavalo cavalo = new Cavalo(3, "Cavalo", plano.tamanhoXPlano, 3, plano);
		Peao peao = new Peao(4, "Peao", plano.tamanhoXPlano, 4, plano);
		Rainha rainha = new Rainha(5, "Rainha", plano.tamanhoXPlano, 5, plano);
		Rei rei = new Rei(6, "Rei", plano.tamanhoXPlano, 6, plano);
		Torre torre = new Torre(7, "Torre", plano.tamanhoXPlano, 7, plano);
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
			
			if(direcaoAndada(andador) == "AVANCAR") {
				andador.Avancar(quantidadeAndada(andador));
			}else {
				andador.Retroceder(quantidadeAndada(andador));
			}
			
			if(direcaoAndada(bispo) == "AVANCAR") {
				bispo.Avancar(quantidadeAndada(bispo));
			}else {
				bispo.Retroceder(quantidadeAndada(bispo));
			}
			
			if(direcaoAndada(cavalo) == "AVANCAR") {
				cavalo.Avancar(quantidadeAndada(cavalo));
			}else {
				cavalo.Retroceder(quantidadeAndada(cavalo));
			}
			
			if(direcaoAndada(andador) == "AVANCAR") {
				peao.Avancar();
			}else {
				peao.Retroceder();
			}
			
			if(direcaoAndada(rainha) == "AVANCAR") {
				rainha.Avancar(quantidadeAndada(rainha));
			}else {
				rainha.Retroceder(quantidadeAndada(rainha));
			}
			
			if(direcaoAndada(rei) == "AVANCAR") {
				rei.Avancar(quantidadeAndada(rei));
			}else {
				rei.Retroceder(quantidadeAndada(rei));
			}
			
			if(direcaoAndada(torre) == "AVANCAR") {
				torre.Avancar(quantidadeAndada(torre));
			}else {
				torre.Retroceder(quantidadeAndada(torre));
			}
			
			salvarAluno();
			encontrouBug();
			
			grade();
		}
	}
	
	public int quantidadeAndada(Robo robo) {
		int quantidadeAndada;
		Scanner input = new Scanner(System.in);
		System.out.println("Quantas casas quer que o(a) " + robo.nome + " ande");
		return quantidadeAndada = input.nextInt();
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
}
