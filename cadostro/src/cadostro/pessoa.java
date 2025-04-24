package cadostro;

public class pessoa {
	
	private String nome;
	private String cpf;
	private String endereco;
	
	public pessoa () {
		
	}
	
	public pessoa (String nome) {
		this.nome = nome;
	}
	
	public pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public pessoa (String cpf, String nome, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

}
