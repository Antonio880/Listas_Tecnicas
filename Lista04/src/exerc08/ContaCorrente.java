package exerc08;

public class ContaCorrente {

	private String name;
	private int id;
	private double dinheiro;
	public ContaCorrente(String name, int id, double dinheiro) {
		this.name = name;
		this.id = id;
		this.dinheiro = dinheiro;
	}
	
	public String fazerSaque(double saque) {
		if(saque <= this.dinheiro) {
			dinheiro -= saque;
			return "A quantidade tirada foi " + saque + "R$ e restou na conta " + dinheiro + "R$";
		}else {
			return "Nao existe quantia suficiente em caixa!";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	
}
