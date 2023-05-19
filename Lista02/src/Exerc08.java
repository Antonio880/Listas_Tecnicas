
public class Exerc08 {

	public static boolean isExpresaoBemFormada(String expressao) {
        int parentesesAbertos = 0;
        int colchetesAbertos = 0;
        int chavesAbertas = 0;
        
        int tamanho_expressao = expressao.length(); 

        for (int i = 0; i < tamanho_expressao; i++) {
            char simbolo = expressao.charAt(i);

            if (simbolo == '(') {
                parentesesAbertos++;
            } 
            
            if (simbolo == ')') {
                parentesesAbertos--;
            } 
            
            if (simbolo == '[') {
                colchetesAbertos++;
            } 

            if (simbolo == ']') {
                colchetesAbertos--;
            } 

            if (simbolo == '{') {
                chavesAbertas++;
            } 

            if (simbolo == '}') {
                chavesAbertas--;
            }

            if (parentesesAbertos > 0 || colchetesAbertos > 0 || chavesAbertas > 0 || parentesesAbertos < 0 || colchetesAbertos < 0 || chavesAbertas < 0) {
                return false;
            }
        }

        return parentesesAbertos == 0 && colchetesAbertos == 0 && chavesAbertas == 0;
	}
	
	public static void main(String[] args) {
		/*
		 * Escreva um programa que utilize uma 
		 * estrutura para determinar se uma 
		 * expressão matemática contendo parênteses, 
		 * colchetes e chaves está bem formada 
		 * (ou seja, se cada símbolo de abertura 
		 * tem um símbolo de fechamento correspondente).
		 * */
		
        String expressao1 = "[3 * (2 + 2)]";
        String expressao2 = "[3 * (2 + 2]";

        System.out.println("Expressão [3 * (2 + 2)]: " + isExpresaoBemFormada(expressao1));
        System.out.println("Expressão [3 * (2 + 2]: " + isExpresaoBemFormada(expressao2));
		
	}

}
