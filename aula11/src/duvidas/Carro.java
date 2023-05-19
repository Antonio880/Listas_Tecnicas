package duvidas;

public class Carro {

	public int id;
	public String placa;
	
	
	
	public Carro  getCarro() {
		return this;
	}
	
   public Carro getCarro2() {
		Carro c = new Carro();
		c.id= this.id;
		c.placa = this.placa;
		return c;
		
	}
	
	public Carro getCarro(Carro c) {
		
		c.id= this.id;
		c.placa = this.placa;
		return c;
		
	}
}

