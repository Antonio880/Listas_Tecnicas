package heranca;

public class Main {

	public static void main(String[] args) {
		
		Carro c= new Carro();
		c.cor="preto";
		c.placa="AAA-8989";
		c.imprimirDados();
		c.numeroPortas =4;
		
		CarroEletrico ce= new CarroEletrico();
		ce.cor="preto";
		ce.placa="AAA-8989";
		ce.imprimirDados();
		ce.numeroPortas=3;
		
		Moto m= new Moto();
		m.cor="branco";
		m.placa="AAA-7878";
		m.imprimirDados();
		
		//Veiculo veiculo = new Veiculo(); abstrato
		
		
				
		
		Seguradora seguradora = new Seguradora();
		
		seguradora.calcularSeguro(m);
		seguradora.calcularSeguro(c);
		seguradora.calcularSeguro(ce);
		
		
		/*
		 *  extends = heranca
		 *  super = referencia ao pai
		 *  abstract =  nao pode ser instanciada
		 *  this    = referencia a propria classe
		 *  final = nao pode ter filho
		 *  private =  atributos e metodos somente podem ser acessados na mesma classe
		 *  public  = livre acesso
		 *  protected = mesmo pacote
		 *  
		 *  encapsulamento = esconder atributos e metodos que devem ser escondidos  
		 *  polimorfismo =  varias formas - (onde passa o pai tem que poder passar o filho  príncipio de Liskov)
		 *  Sobrecarga: Sobrecarregar metodos significa ter vários métodos com nomes iguais mais assinaturas diferentes.
		 *  Sobreescrita: O ato de sobrescrever um metodo ou propriedade significa dar uma nova forma ao mesmo, uma nova versao. 
		 * */

	}

}
