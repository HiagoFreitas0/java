import java.util.List;

public class ProdutoFabricado implements IProdutoFabricado{
	
	private String nome;
    private List<IProduto> ingredientes;
    
	public ProdutoFabricado(String nome, List<IProduto> ingredientes) {
		this.nome = nome;
		this.ingredientes = ingredientes;
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public float getCusto() {
		float soma = 0;
        for (IProduto ingrediente : ingredientes) {
            soma += ingrediente.getCusto();
        }
        return soma;
	}
	@Override
	public IProduto getIngrediente(int numero) {
		return ingredientes.get(numero);
	}
	@Override
	public int getQuantidadeIngredientes() {
		return ingredientes.size();
	}
}
