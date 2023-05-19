package excecoes;

public class C {

	public void test() {
		OperarPaciente p = new  OperarPaciente();
		int array[]= new int [2];
		array[0]=1;
		try {
		p.operar(array);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
