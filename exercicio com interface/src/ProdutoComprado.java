
public class ProdutoComprado implements IProduto{
	
	private String nome;
    private float custo;
    
	public ProdutoComprado(String nome, float custo) {
		this.nome = nome;
		this.custo = custo;
	}

	public String getNome() {
		return nome;
	}

	public float getCusto() {
		return custo;
	}
}
