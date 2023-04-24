package exerc05;

public class Contato {
	private int codigo;
	private String nome;
	private String endereco;
	private String email;
	private int telefone;
	private String observacao;
	
	public Contato(int codigo){
		boolean controle = true;
		do{
			if(codigo >= 1000 && codigo <= 9999) {
				this.codigo = codigo;
			}else {
				controle = false;
			}
		}while(!controle);
	}
	
	public Contato(int codigo, String nome) {
		boolean controle = true;
		do{
			if(codigo >= 1000 && codigo <= 9999) {
				this.codigo = codigo;
			}else {
				controle = false;
			}
		}while(!controle);
		this.nome = nome;
	}
	
	public Contato(int codigo, String nome, String email) {
		boolean controle = true;
		do{
			if(codigo >= 1000 && codigo <= 9999) {
				this.codigo = codigo;
			}else {
				controle = false;
			}
		}while(!controle);
		this.nome = nome;
		this.email = email;
	}
	
	public Contato(int codigo, String nome, String email, int telefone) {
		boolean controle = true;
		do{
			if(codigo >= 1000 && codigo <= 9999) {
				this.codigo = codigo;
			}else {
				controle = false;
			}
		}while(!controle);
		this.nome = nome;
		this.email = email;
		do {
			if(telefone >= 10000000 && telefone <= 99999999) {
				this.telefone = telefone;
				controle = true;
			}else {
				controle = false;
			}
		}while(!controle);
	}
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		boolean controle = true;
		do{
			if(codigo >= 1000 && codigo <= 9999) {
				this.codigo = codigo;
			}else {
				controle = false;
			}
		}while(!controle);
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		boolean controle = true;
		do {
			if(telefone >= 10000000 && telefone <= 99999999) {
				this.telefone = telefone;
				controle = true;
			}else {
				controle = false;
			}
		}while(!controle);
		this.telefone = telefone;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getEmail() {
		return email;
	}
	
	public void ImprimirCodigo() {
		System.out.println("Código: " + this.codigo);
	}
	
	public void ImprimirNome() {
		System.out.println("Nome: " + this.nome);
	}
	
	public void ImprimirEndereco() {
		System.out.println("Endereco: " + this.endereco);
	}
	public void ImprimirEmail() {
		System.out.println("Email: " + this.email);
	}
	public void ImprimirTelefone() {
		System.out.println("Telefone: " + this.telefone);
	}
	public void ImprimirObservacao() {
		System.out.println("Obeservacao: " + this.observacao);
	}
	
	public Contato duplicarContato() {
		//Contato contato = new Contato(codigo, email, email, codigo);
		return new Contato(this.codigo, this.email, this.endereco, this.telefone);
	}
	
	public boolean verificarPreenchimento() {
		if(this.codigo == 0|| this.email == null || this.endereco == null || this.nome == null || this.observacao == null || this.telefone == 0){
			return false;
		}else {
			return true;
		}
	}
	
}
