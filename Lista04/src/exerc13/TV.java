package exerc13;

public class TV {

	private int volume;
	private boolean on;
	private int canal;
	
	public TV(int volume, boolean on, int canal) {
		super();
		this.volume = volume;
		this.on = on;
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	
}
