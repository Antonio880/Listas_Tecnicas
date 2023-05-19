package aula7;

public class Carro {

	// atributos
	private int codigo;
	public String placa;
	protected int velocidade;
	public int versao;
	public Motor meuMotor;

	
	
	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	public Carro(int velocidade, Motor meuMotor) {
		this.velocidade = velocidade;
		this.meuMotor = meuMotor;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		
		if(codigo>0 && codigo<=10)
		   this.codigo= codigo;
	}
	
	public Carro() {
		this.meuMotor= new Motor();
		this.codigo=10;
	}
	
	public Carro(int codigo, String placa, int velocidade, int versao, Motor meuMotor) {
		this.codigo = codigo;
		this.placa = placa;
		this.velocidade = velocidade;
		this.versao = versao;
		this.meuMotor = meuMotor;
		
	}

	public Carro(boolean motor) {
		int meuMotor =20;
		this.rotina();
		if (motor) {
			this.meuMotor = new Motor();
			this.meuMotor.potencia = 2;
			System.out.println(meuMotor);
		}
	}

	public void rotina() {
		System.out.println("Regra 1");
		System.out.println("Regra 2");
		System.out.println("Regra 3");
	}

	// metodos
	public void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}

}
