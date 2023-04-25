package exerc05;

public class Main {
	public static void main(String[] args) {
		Contato contato = new Contato(1001, "Antonio", "antoniocruzgomes880@gmail.com", 93921392);
		
		//contato.setTelefone(92345614);
		System.out.println(contato.getTelefone());
		System.out.println(contato.getEmail());
		contato.setEndereco("Sitio");
		contato.setObservacao("alguma coisa");
		
		
		contato.ImprimirDados();
		
		Contato contato2 = contato.duplicarContato();
		
		//contato2.ImprimirDados();
		
		boolean teste = contato.verificarPreenchimento();
		if(teste == false) {
			System.out.println("Está faltando algo no código");
		}else {
			System.out.println("Está tudo cadastrado");
		}
		
		Cliente cliente = new Cliente();
		
		cliente.agenda.listaContato.setCodigo(1002);
		cliente.agenda.listaContato.getCodigo();
	}
}