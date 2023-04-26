package exerc08;

public class ContaEspecial extends ContaCorrente{

	
	private double limite;
	public ContaEspecial(String name, int id, double dinheiro, double limite) {
		super(name, id, dinheiro);
		this.limite = limite;
		// TODO Auto-generated constructor stub
	}
	
	public String fazerSaque(double saque) {
		double dinheiro = this.getDinheiro();
		if(saque <= dinheiro) {
			dinheiro -= saque;
			return "A quantidade tirada foi " + saque + "R$ e restou na conta " + this.getDinheiro() + "R$";
		}else if(saque <= (this.getDinheiro() + limite)) {
			limite = (dinheiro + limite) - saque;
			dinheiro -= saque;
			return "A quantidade tirada foi " + saque + "R$ e restou na conta " + dinheiro + "R$" + " e você usou " + limite + " R$ do seu limite";
		}else {
			return "Nao existe quantia suficiente em caixa!";
		}
	}

}
