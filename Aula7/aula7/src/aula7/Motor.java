package aula7;

public class Motor {

	public int potencia;
	
	private void autoExplosao() {
		System.out.println("Morri!");
	}
	
	public boolean verificarTemperatura() {
		
		if(true) {
			this.autoExplosao();
		}
		return true;
	}
}
