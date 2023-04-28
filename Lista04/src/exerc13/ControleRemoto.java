package exerc13;

public class ControleRemoto {

	private int id;
	private TV tv;
	public ControleRemoto(int id, TV tv) {
		super();
		this.id = id;
		this.tv = tv;
	}
	
	public String ligarDesligar(String onOff) {
		onOff = onOff.toUpperCase();
		if(onOff == "ON" && tv.isOn() == false) {
			tv.setOn(true);
			return "A tv esta ligada";
		}else if(onOff == "ON" && tv.isOn() == true){
			return "A tv ja esta ligada, se deseja desligar, digite OFF";
		}else if(onOff == "OFF" && tv.isOn() == true) {
			tv.setOn(false);
			return "A TV foi desligada";
		}else if(onOff == "OFF" && tv.isOn() == false) {
			return "A TV ja esta desligada, se deseja ligar, digite ON";
		}else {
			return "Por favor digite ON ou OFF";
		}
	}
	
	public void mudarCanalUnidade(String onOff) {
		onOff = onOff.toLowerCase();
		if( onOff == "aumentar" && tv.getCanal() > 0 && tv.getCanal() < 50) {
			tv.setCanal(tv.getCanal()+1);
		}else if(onOff == "abaixar" && tv.getCanal() <50 && tv.getCanal() > 0) {
			tv.setVolume(tv.getVolume()-1);
		}
	}
	
	public void mudarCanal(int canal) {
		if( canal > 0 && canal < 50) {
			tv.setCanal(canal);
		}
	}
	
	public void mudarVolume(String onOff) {
		onOff = onOff.toLowerCase();
		if( onOff == "aumentar" && tv.getVolume() > 0 && tv.getVolume() < 100) {
			tv.setVolume(tv.getVolume()+1);
		}else if(onOff == "abaixar" && tv.getVolume() < 100 && tv.getVolume() > 0) {
			tv.setVolume(tv.getVolume()-1);
		}
	}
	
	public String mute(String onOff) {
		onOff = onOff.toUpperCase();
		if(onOff == "ON" && tv.isOn() == false) {
			tv.setOn(true);
			return "A tv esta mutada";
		}else if(onOff == "ON" && tv.isOn() == true){
			return "A tv ja esta mutada, se deseja desligar o mute, digite OFF";
		}else if(onOff == "OFF" && tv.isOn() == true) {
			tv.setOn(false);
			return "A TV foi mutada";
		}else if(onOff == "OFF" && tv.isOn() == false) {
			return "A TV ja esta mutada, se deseja ligar o mute, digite ON";
		}else {
			return "Por favor digite ON ou OFF";
		}
	}

	@Override
	public String toString() {
		return "ControleRemoto [Volume=" + tv.getVolume() + ", Canal=" + tv.getCanal() + "]";
	}
	
}

