import java.util.ArrayList;
import java.util.List;

public class GerenteProdutos {
	
	public static IProduto reduzirCusto(IProduto produto) {
        // Se o produto não for fabricado, não há como reduzir mais
        if (!(produto instanceof IProdutoFabricado)) {
            return produto;
        }
        
        IProdutoFabricado pf = (IProdutoFabricado) produto;
        List<IProduto> novosIngredientes = new ArrayList<>();

        for (int i = 0; i < pf.getQuantidadeIngredientes(); i++) {
            IProduto ingrediente = pf.getIngrediente(i);
            // Recursivamente reduz o custo de cada ingrediente
            IProduto reduzido = reduzirCusto(ingrediente);
            novosIngredientes.add(reduzido);
        }
        
        ProdutoFabricado fabricadoReduzido = new ProdutoFabricado(produto.getNome(), novosIngredientes);

        // Se o custo reduzido for menor que o custo atual, retorna o novo produto
        if (fabricadoReduzido.getCusto() < produto.getCusto()) {
            return fabricadoReduzido;
        } else {
            return produto;
        }
	}
}
