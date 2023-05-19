package duvidas;

public class Main {

	public static void main(String[] args) {
		
		Carro c= new Carro();
		c.id=20;
		c.placa = "AAA-2323";
		
       Carro c1= new Carro();
       c1= c.getCarro();
       
       Carro c2 = new Carro();
       c.getCarro(c2);
//       System.out.println(c2.placa + " - "+c2.id + c + " -- "+ c2);
		
       Carro c3 = c.getCarro2();
       System.out.println(c3.placa + " - "+c3.id + c + " -- "+ c3);
	   System.out.println( c3.getClass());
		
	}

}
