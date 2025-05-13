
public abstract class pessoa {
	
	protected String nome;

	public pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void exibirDados();
	
}
