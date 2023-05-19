package heranca;

public  class Carro  extends Veiculo{

	public int numeroPortas;
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Carro - placa"+ placa + "cor: "+ cor);
	}
}
