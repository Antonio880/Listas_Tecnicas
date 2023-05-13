package exerc18;
import java.util.Scanner;

public class Jogo {
	private String nomeUser;
	private Plano plano;
	protected Robo robo;
	protected Moeda moeda;
	public Scanner input = new Scanner(System.in);
	
	public Jogo(String nomeUser, Plano plano, Robo robo, Moeda moeda) {
		this.nomeUser = nomeUser;
		this.plano = plano;
		this.robo = robo;
		this.moeda = moeda;
	}
	
	public void Grade() {
		Celula aux = null;
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				aux = plano.areaJogo[i][j];
				if(aux.robo != null && aux.robo instanceof Robo)
					System.out.print(" ¢ ");
				if(aux.robo == null && aux.caractere instanceof CaractereEspecial)
					System.out.print(" @ ");
				if(aux.moeda != null && aux.moeda instanceof Moeda)
					System.out.print(" $ ");
				if(aux.robo == null && aux.moeda == null && aux.caractere == null) 
					System.out.print(" * ");
				if((aux.posicaoYCelula + 1) % plano.tamanhoY == 0) {
					System.out.println();
				}
			}
		}
	}

	/*
	 * norte, sul, leste, oeste, nordeste, sudeste, sudoeste e noroeste.
	 */
	
	public void Jogo() {
		boolean verificarRobo = false;
		int andadoNorte = 0;
		int andadoSul = 0;
		int andadoLeste = 0;
		int andadoOeste = 0;
		int andadoNordeste = 0;
		int andadoNoroeste = 0;
		int andadoSudeste = 0;
		int andadoSudoeste = 0;
		String opcao = "";
		do {
			
			System.out.println();
			Grade();
			
			do {
				System.out.println("Digite a direcao que deseja andar!");
				opcao = input.nextLine();
				opcao = opcao.toUpperCase();
				
			}while(robo.verificarMovimentacao(opcao));
			if(opcao.equals("NORTE")) 
				andadoNorte += robo.avancarNorte();
			else if(opcao.equals("SUL")) 
				andadoSul += robo.retrocederSul();
			else if(opcao.equals("LESTE")) 
				andadoLeste += robo.avancarLeste();
			else if(opcao.equals("OESTE")) 
				andadoOeste += robo.avancarOeste();
			else if(opcao.equals("NORDESTE")) 
				andadoNordeste += robo.avancarNordeste();
			else if(opcao.equals("SUDESTE"))
				andadoSudeste += robo.retrocederSudeste();
			else if(opcao.equals("SUDOESTE"))
				andadoSudoeste += robo.retrocederSudoeste();
			else if(opcao.equals("NOROESTE"))
				andadoNoroeste += robo.avancarNoroeste();
			else
				verificarRobo = true;
			
			verificarRobo = verificarExistenciaMoeda();
			if(verificarRobo == false) {
				System.out.println("O Robo Conseguiu pegar a moeda!");
			}
		}while(verificarRobo);
		Grade();
		System.out.println();
		System.out.println("Foi andando para Norte: " + andadoNorte + " Sul: " + andadoSul + " Leste: " + andadoLeste + " Oeste: " + andadoOeste + " Nordeste: " + andadoNordeste + " Sudoeste: " + andadoSudoeste + " Noroeste: " + andadoNoroeste + " Sudeste: " + andadoSudeste);
		System.out.println("O robo andou " + contadorPosicoesPassadas() + " vezes" + " e faltou andar em " + contarPosicoesNaoPassou() + " posicoes!");
	}
	
	public boolean verificarExistenciaMoeda() {
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				if(plano.areaJogo[i][j].moeda instanceof Moeda) {
					return true;
				}
			}
		}
		return false;
	}
	
	public int contadorPosicoesPassadas() {
		Celula aux = null;
		int cont = 0;
		for (int i = 0; i < plano.tamanhoX; i++) {
			for (int j = 0; j < plano.tamanhoY; j++) {
				aux = plano.areaJogo[i][j];
				if(aux.robo == null && aux.caractere instanceof CaractereEspecial)
					cont++;
			}
		}
		return cont;
	}
	
	public int contarPosicoesNaoPassou() {
		return (plano.tamanhoX * plano.tamanhoY) - contadorPosicoesPassadas();
	}
}
