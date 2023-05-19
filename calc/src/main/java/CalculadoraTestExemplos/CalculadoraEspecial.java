package CalculadoraTestExemplos;

import java.util.Scanner;

public class CalculadoraEspecial {

	public float media(int vet[], int tamanho) {
		float media = 0;
		media = somatorio(vet) / tamanho-1;
		return media;
	}
	
	public void preencherVetor(int vet[], int inicio, int fim) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) ((Math.random() * fim) + inicio);
		}
	}

	public void imprimir(int[] vet) {
		System.out.println();
		for (int i = 0; i < vet.length; i++) {
			System.out.print(" [" + i + "] " + vet[i]);
			if (i % 20 == 0 && i != 0) {
				System.out.println();
			}
		}
		System.out.println();

	}

	public String imprimirElementosVetor(int vet[]) {
		String resultado = "";
		for (int i : vet) {
			resultado += " | " + i;
		}
		return resultado;
	}

	public int interacaoUsuario(String msg) {
		Scanner ler = new Scanner(System.in);
		System.out.print(msg);
		return ler.nextInt();
	}

	public void respostaQuestao(String questao, String resposta) {
		System.out.println("\nResposta: \n");
		System.out.println("Funcionalidade: " + questao);
		System.out.println("Resposta: " + resposta);
		System.out.println("\n\n");
	}

	/* Fim funcoes de utilidades */

	
	// Funcionalidade 1
	public int pesquisar(int vet[], int numeroPesquisa) {
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == numeroPesquisa)
				return i;
		}
		return -100;
	}

	// Funcionalidade 2
	public int pesquisarPorIndice(int vet[], int indice) {
		return vet[indice];
		
	}

	// Funcionalidade 3
	public void seraracao(int vet[], int vetNegativo[], int vetPositivo[]) {

		int indiceNegativo = 0;
		int indicePositivo = 0;

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				vetNegativo[indiceNegativo] = vet[i];
				indiceNegativo++;
			} else {
				vetPositivo[indicePositivo] = vet[i];
				indicePositivo++;
			}
			i++;
		}
	}

	// Funcionalidade 4
	public int somatorio(int vet[]) {
		int somatorio = 0;
		for (int i = 0; i <= vet.length; i++) {
			somatorio += vet[i];
		}
		return somatorio;
	}

	// Funcionalidade 5
	public int[] juncao(int vetA[], int vetB[]) {
		int uniao[] = new int[vetA.length * 2];

		int cont = 0;
		for (int i = 0; i < uniao.length; i++) {
			if (i == vetA.length) {
				cont = 0;
			}
			if (i >= vetA.length) {
				uniao[i] = vetA[cont];
				cont++;
			} else {
				uniao[i] = vetB[cont];
				cont++;
			}
		}
		return uniao;
	}

	// Funcionalidade 6
	public int[] inversao(int vet[]) {
		int aux[] = new int[vet.length];
		int cont = vet.length - 1;
		for (int i = 0; i < vet.length; i++) {
			aux[i] = vet[cont];
			cont--;
		}
		return vet;
	}

	// Funcionalidade 7
	public void inversaoDeVetores(int vetA[], int vetB[]) {
		int aux[] = new int[vetA.length];

		for (int i = 0; i < aux.length; i+=2) {
			aux[i] = vetA[i];
			vetA[i] = vetB[i];
			vetB[i] = aux[i];
		}
	}

	

	// Funcionalidade 8
	public int[] priorizacao(int vet[]) {
		int aux[] = new int[vet.length];

		int indice = 0;
		float mediaTotal = vet[0];

		for (int i = 0; i < vet.length; i++) {

			if (vet[i] < mediaTotal) {
				aux[indice] = vet[i];
				indice++;
				mediaTotal = media(aux, indice);
			}
		}
		return aux;
	}

	// Funcionalidade 10
	public int[] descompactacao(int vet[]) {
		int cont = 0;
		for (int i = 0; i < vet.length; i++) {
			cont += vet[i];
		}
		int aux[] = new int[cont];

		int indiceAux = 0;
		int indiceVet = 0;
		for (int i = 0; i < vet.length; i += 2) {
			aux[indiceAux] = vet[indiceVet];
			indiceAux++;
			for (int j = 1; j < vet[i + 1]; j++) {
				aux[indiceAux] = vet[i];
				indiceAux++;
			}

			indiceVet = i + 2;

		}
		return aux;
	}

	public String trocarCaracter(String s) {
		String aux = "";
		switch (s) {
		case "a":
			aux = "%";
			break;
		case "b":
			aux = "*";
			break;
		case "c":
			aux = "(";
			break;
		case "d":
			aux = "-";
			break;
		case "e":
			aux = "+";
			break;
		case "f":
			aux = "@";
			break;
		case "g":
			aux = "#";
			break;
		case "h":
			aux = "1";
			break;
		case "i":
			aux = "2";
			break;
		case "j":
			aux = "3";
			break;
		case "l":
			aux = "4";
			break;
		case "m":
			aux = "5";
			break;
		case "n":
			aux = "6";
			break;
		case "o":
			aux = "7";
			break;
		case "p":
			aux = "8";
			break;
		case "q":
			aux = "9";
			break;
		case "r":
			aux = "{";
			break;
		case "s":
			aux = "}";
			break;
		case "t":
			aux = "!";
			break;
		case "u":
			aux = "&";
			break;
		case "v":
			aux = "$";
			break;
		case "x":
			aux = "?";
			break;
		case "z":
			aux = ":";
			break;
		default:
			break;

		}
		return aux;

	}

	public String trocarCaracterDescriptografia(String s) {
		String aux = "";
		switch (s) {
		case "%":
			aux = "a";
			break;
		case "*":
			aux = "b";
			break;
		case "'":
			aux = "c";
			break;
		case "-":
			aux = "d";
			break;
		case "+":
			aux = "e";
			break;
		case "@":
			aux = "f";
			break;
		case "#":
			aux = "g";
			break;
		case "1":
			aux = "h";
			break;
		case "2":
			aux = "i";
			break;
		case "3":
			aux = "j";
			break;
		case "4":
			aux = "l";
			break;
		case "5":
			aux = "m";
			break;
		case "6":
			aux = "n";
			break;
		case "7":
			aux = "o";
			break;
		case "8":
			aux = "p";
			break;
		case "9":
			aux = "q";
			break;
		case "{":
			aux = "r";
			break;
		case "}":
			aux = "s";
			break;
		case "!":
			aux = "t";
			break;
		case "&":
			aux = "u";
			break;
		case "$":
			aux = "v";
			break;
		case "?":
			aux = "x";
			break;
		case ":":
			aux = "z";
			break;
		default:
			break;

		}
		return aux;

	}

	// Funcionalidade 12
	public String[] criptografia(String msg[]) {
		String resp[] = new String[msg.length];
		for (int i = 0; i < msg.length; i++) {
			String aux[] = msg[i].split("");
			String result = "";
			for (String s : aux) {
				result += trocarCaracter(s);
			}
			resp[i] = result;
		}
		return resp;
	}

	// Funcionalidade 13
	public String[] descriptografia(String msg[]) {
		String resp[] = new String[msg.length];
		for (int i = 0; i < msg.length; i++) {
			String aux[] = msg[i].split("");
			String result = "";
			for (String s : aux) {
				result += trocarCaracterDescriptografia(s);
			}
			resp[i] = result;
		}
		return resp;
	}

	// Funcionalidade 14
	public int[] contadorDeElementos(int entrada[]) {

		int[] resp = new int[entrada.length * 2];

		resp[0] = entrada[0];
		// resp[1] = 1;

		int indiceQuant = 1;
		int indiceElmento = 0;

		for (int i = 0; i < entrada.length; i++) {

			if (entrada[i] == resp[indiceElmento]) {
				resp[indiceQuant]++; // resp[indiceResp]= resp[indiceResp]+1;
			} else {
				indiceElmento = indiceQuant + 1;
				resp[indiceElmento] = entrada[i];

				indiceQuant = indiceElmento + 1;
				resp[indiceQuant] = 1;
			}

		}

		return resp;
	}

	// Funcionalidade 15
	public int[] complementacao(int vetA[], int vetB[]) {

		int aux[] = new int[vetA.length];

		for (int i = 0; i < vetA.length; i++) {

			aux[i] = 10 - (vetA[i] + vetB[i]);
		}

		return aux;
	}

	// Funcionalidade 16
	public int[] polarizacao(int vet[]) {

		int aux[] = new int[vet.length];

		int fim = vet.length - 1;
		int inicio = 0;
		for (int i = 0; i < vet.length; i++) {

			if (vet[i] % 2 == 0) {
				aux[fim] = vet[i];
				fim--;
			} else {
				aux[inicio] = vet[i];
				inicio++;
			}
		}

		return aux;
	}

	// Funcionalidade 17
	public int[] explosao(int vet[]) {
		int cont = 0;
		for (int i = 0; i < vet.length; i++) {
			cont += vet[i];
		}
		int aux[] = new int[cont];

		int temp = 0;
		int indice = 0;
		for (int i = 0; i < vet.length; i++) {
			while (temp < vet[i]) {
				aux[indice] = vet[i];
				temp++;
				indice++;
			}
			temp = 0;
		}

		return aux;
	}

	// Funcionalidade 18
	public int[] organizacao(int vet[]) {
		int[] aux = new int[vet.length];
		int cont = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != -100) {
				aux[cont] = vet[i];
				cont++;
			}
			for (int j = i + 1; j < vet.length; j++) {
				if (vet[i] == vet[j] && vet[j] != -100) {
					aux[cont] = vet[j];
					cont++;
					vet[j] = -100;
				}
			}
		}
		return aux;
	}

	// Funcionalidade 19
	public int[][] agrupamento(int[] vet, int numAgrupamento) {
		int tamanhoVetores = vet.length / numAgrupamento;
		int resp[][] = new int[numAgrupamento][];
		int limiteInferior = 0;
		int limiteSuperior = tamanhoVetores;
		for (int i = 0; i < numAgrupamento; i++) {
			resp[i] = new int[tamanhoVetores];
			int indice = 0;

			for (int j = limiteInferior; j < limiteSuperior; j++) {
				resp[i][indice] = vet[j];
				indice++;
			}
			limiteInferior = limiteSuperior;
			limiteSuperior = limiteInferior + tamanhoVetores;
			indice = 0;
		}

		return resp;
	}

	// Funcionalidade 20
	public int[] diferencaA(int vetA[], int vetB[]) {
		int diferenca[] = new int[vetA.length];
		int cont = 0;
		for (int i = 0; i < vetA.length; i++) {
			if (pesquisar(vetA, vetB[i]) == -1000) {
				if (pesquisar(diferenca, vetB[i]) == -1000) {
					diferenca[cont] = vetB[i];
					cont++;
				}
			}
		}
		return diferenca;
	}

	/* respostas das quest�es */
	public void questao1(int vet[]) {
		preencherVetor(vet, -50, 150);
		int resposta = pesquisar(vet, interacaoUsuario("Escolha um n�mero para busca"));

		if (resposta != -100) {
			respostaQuestao("Pesquisa - Q1", "IndicePesquisado = " + resposta);
		} else {
			respostaQuestao("Pesquisa - Q1", " Numero n�o encontrado!");
		}
		imprimir(vet);
	}

	public void questao2(int vet[]) {
		preencherVetor(vet, -30, 100);
		int indice = interacaoUsuario("Informe o �ndice do vetor desejado");
		int resposta = pesquisarPorIndice(vet, indice);

		respostaQuestao("Pesquisa - Q2", " | indice = " + indice + " | elemento = " + resposta);
		imprimir(vet);
	}

	public void questao3(int vet[]) {
		preencherVetor(vet, -5, 50);
		imprimir(vet);
		int vetNegativo[] = new int[vet.length];
		int vetPositivo[] = new int[vet.length];

		seraracao(vet, vetNegativo, vetPositivo);

		respostaQuestao("Separa��o - Q3 ", "Elementos positivos: = " + imprimirElementosVetor(vetPositivo));

		respostaQuestao("Separa��o - Q3 ", "Elementos negativos: = " + imprimirElementosVetor(vetNegativo));
	}

	public void questao4(int vet[]) {
		preencherVetor(vet, -5, 5);
		imprimir(vet);
		respostaQuestao("Somat�rio - Q4", "somatorio = " + somatorio(vet));
	}

	public void questao5(int vetA[], int vetB[]) {
		preencherVetor(vetA, 1, 5);
		preencherVetor(vetB, 1, 5);
		imprimir(vetA);
		imprimir(vetB);
		respostaQuestao("Jun��o - Q5: ", " Jun��o = " + imprimirElementosVetor(juncao(vetA, vetB)));
	}

	public void questao6(int vet[]) {
		preencherVetor(vet, 1, 5);
		imprimir(vet);
		respostaQuestao("Invers�o de ordem - Q6: ", " vetor invertido: " + imprimirElementosVetor(inversao(vet)));
	}

	public void questao7(int vetA[], int vetB[]) {
		preencherVetor(vetA, 1, 5);
		preencherVetor(vetB, 1, 5);
		imprimir(vetA);
		imprimir(vetB);
		inversaoDeVetores(vetA, vetB);
		respostaQuestao("Invers�o de vetores - Q6: ",
				" vetor A: " + imprimirElementosVetor(vetA) + "\n vetor B: " + imprimirElementosVetor(vetB));

	}

	public void questao8(int[] vetA) {
		preencherVetor(vetA, 1, 150);
		imprimir(vetA);
		respostaQuestao("Priorizacao - Q8: ", imprimirElementosVetor(priorizacao(vetA)));

	}

	public void questao10(int[] vetA) {
		preencherVetor(vetA, 0, 2);
		imprimir(vetA);
		respostaQuestao("Compactacao - Q10: ", imprimirElementosVetor(contadorDeElementos(vetA)));

	}

	public boolean verificarEntradaPossivelParaQuestao11(int[] vetA) {

		for (int i = 0; i < vetA.length; i++) {
			if (vetA[i] > 9) {
				return false;
			}
		}
		return true;
	}

	public void questao11(int[] vetA) {
		preencherVetor(vetA, 1, 11);
		imprimir(vetA);

		// fazendo com inteiros somente � possivel se a quantidade dos elementos for
		// menor ou igual a 9
		if (verificarEntradaPossivelParaQuestao11(vetA)) {
			respostaQuestao("Descompactacao - Q11: ", imprimirElementosVetor(descompactacao(vetA)));
		} else {
			respostaQuestao("Descompactacao - Q11: ",
					"Nao eh possivel fazer a descompactacao para essa entrada " + imprimirElementosVetor(vetA));
		}
	}

	public void questao12() {
		String vet[] = { "casa", "verde", "passaro", "grande", "menino", "carro" };
		String resp[] = criptografia(vet);

		for (String s : resp) {
			System.out.println(s);
		}
	}

	public void questao13() {
		String vet[] = { "casa", "verde", "passaro", "grande", "menino", "carro" };
		vet = criptografia(vet);

		System.out.println("Mensagem criptografada");
		for (String s : vet) {
			System.out.println(s);
		}
		String resp[] = descriptografia(vet);

		System.out.println("Mensagem descriptografada");
		for (String s : resp) {
			System.out.println(s);
		}
	}

	public void questao14(int[] vetA) {
		preencherVetor(vetA, 1, 10);
		imprimir(vetA);
		respostaQuestao("Contagem de caracteres - Q14: ", imprimirElementosVetor(contadorDeElementos(vetA)));

	}

	public void questao15(int[] vetA, int[] vetB) {
		preencherVetor(vetA, -10, 20);
		preencherVetor(vetB, -10, 20);
		imprimir(vetA);
		imprimir(vetB);
		respostaQuestao("Complementacao- Q15: ", imprimirElementosVetor(complementacao(vetA, vetB)));

	}

	public void questao16(int[] vetA) {
		preencherVetor(vetA, 0, 50);
		imprimir(vetA);

		respostaQuestao("Polarizacao- Q16: ", imprimirElementosVetor(polarizacao(vetA)));

	}

	public void questao17(int[] vetA) {
		preencherVetor(vetA, 0, 10);
		imprimir(vetA);

		respostaQuestao("Explocao- Q17: ", imprimirElementosVetor(explosao(vetA)));

	}

	public void questao18(int[] vetA) {
		preencherVetor(vetA, 0, 10);
		imprimir(vetA);
		respostaQuestao("Organizacao- Q18: ", imprimirElementosVetor(organizacao(vetA)));
	}

	public void questao20(int vetA[], int vetB[]) {

		preencherVetor(vetA, 1, 500);
		imprimir(vetA);
		preencherVetor(vetB, 1, 500);
		imprimir(vetB);
		respostaQuestao("Diferen�a-A - Q20: ", imprimirElementosVetor(diferencaA(vetA, vetB)));
	}

	public void questao19(int vet[]) {
		int numAgrupamento = 0;

		boolean repetir;
		do {
			repetir = false;
			numAgrupamento = interacaoUsuario("Escolha o n�mero do agrupamento!");

			if (vet.length % numAgrupamento != 0) {
				System.out.println("informe um num�ro m�ltiplo de " + vet.length);
				repetir = true;
			}
		} while (repetir);

		preencherVetor(vet, 1, 100);

		int resposta[][] = agrupamento(vet, numAgrupamento);

		for (int i = 0; i < numAgrupamento; i++) {
			respostaQuestao("Agrupamento - Q19: ",
					"Agrupamento n�mero: " + (i + 1) + " = " + imprimirElementosVetor(resposta[i]));
		}
	}

	public void listaQuestoes() {
		System.out.println("*** Lista 3 **** \n " + "\nEscolha uma opera��o:" + "\n1) Pesquisa"
				+ "\n2) Pesquisa por �ndice" + "\n3) Separa��o de valores positivos e valores negativos"
				+ "\n4) Somat�rio" + "\n5) Jun��o de vetor" + "\n6) Invers�o de ordem" + "\n7) Invers�o de vetores"
				+ "\n8) Prioriza��o" + "\n10) Compacta��o " + "\n11) Descompacta��o" + "\n12) Criptografia"
				+ "\n13) Descritografia" + "\n14) Contagem de caracteres" + "\n15) Complementa��o" + "\n16) Polariza��o"
				+ "\n17) Explos�o" + "\n18) Organiza��o" + "\n19) Agrupamento" + "\n20) Diferen�a-A\n");
	}

	public void menu(int vetA[], int vetB[]) {
		int questao = 0;
		listaQuestoes();
		do {

			questao = interacaoUsuario("Escolha uma funcionalidade da lista pelo seu n�mero!");

			switch (questao) {

			case -1:
				listaQuestoes();
				break;
			case 1:
				questao1(vetA);
				break;
			case 2:
				questao2(vetA);
				break;
			case 3:
				questao3(vetA);
				break;
			case 4:
				questao4(vetA);
				break;
			case 5:
				questao5(vetA, vetB);
				break;
			case 6:
				questao6(vetA);
				break;
			case 7:
				questao7(vetA, vetB);
				break;
			case 8:
				questao8(vetA);
				break;
			case 10:
				questao10(vetA);
				break;
			case 11:
				questao11(vetA);
				break;
			case 12:
				questao12();
				break;
			case 13:
				questao13();
				break;
			case 14:
				questao14(vetA);
				break;
			case 15:
				questao15(vetA, vetB);
				break;
			case 16:
				questao16(vetA);
				break;
			case 17:
				questao17(vetA);
				break;
			case 18:
				questao18(vetA);
				break;
			case 19:
				questao19(vetA);
				break;
			case 20:
				questao20(vetA, vetB);
				break;
			case 0:
				System.out.println("Fim - obrigado!");
				break;

			default:
				System.out.println("opcao nao v�lida.");
				break;
			}
			System.out.println(
					"\n\n****************************************************\nEscolha a opcao -1 para ver o menu de funcionalidades\n****************************************************");
		} while (questao != 0);
	}

}
