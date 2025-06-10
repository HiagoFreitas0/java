
public interface IProdutoFabricado extends IProduto{
	
	IProduto getIngrediente(int numero);
    int getQuantidadeIngredientes();

}
