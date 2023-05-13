package exerc16;

public class Main {

		public static void main(String[] args) {
	        Elevador elevador = new Elevador(10, 5); // capacidade: 10, totalAndares: 5
	        elevador.entra(); // entra uma pessoa
	        elevador.sobe(); // sobe para o andar 1
	        elevador.entra(); // entra mais uma pessoa
	        elevador.sobe(); // sobe para o andar 2
	        elevador.sobe(); // sobe para o andar 3
	        elevador.sai(); // sai uma pessoa
	        elevador.desce(); // desce para o andar 2
	        elevador.desce(); // desce para o andar 1
	        elevador.desce(); // desce para o térreo
	        elevador.sai(); // tenta sair, mas o elevador já está vazio
	    }
	}



