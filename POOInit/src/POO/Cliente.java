package POO;

public class Cliente {

	public String name;
	public int id;
	
	public Cliente() {
		this.id = 1;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
