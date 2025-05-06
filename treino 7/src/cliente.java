
public class cliente extends pessoa{
	
	private String cpf;

	public cliente(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public cliente(String nome) {
		super(nome);
		
	}

	@Override
	public void exibirDados() {
		System.out.println("cliente: " + nome);
		System.out.println("cpf: " + cpf);
	}
	
	
	

}
