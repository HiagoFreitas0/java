import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		IProduto farinha = new ProdutoComprado("Farinha",5);
        IProduto ovo = new ProdutoComprado("Ovo", 2);
        IProduto leite = new ProdutoComprado("Leite", 4);

        List<IProduto> ingredientesBolo = Arrays.asList(farinha, ovo, leite);
        IProdutoFabricado bolo = new ProdutoFabricado("Bolo", ingredientesBolo);

        // Produto comprado caro, mas mesmo nome do bolo
        IProduto boloComprado = new ProdutoComprado("Bolo", 20);

        // Reduzir custo
        IProduto otimo = GerenteProdutos.reduzirCusto(boloComprado);

        System.out.println("Produto final: " + otimo.getNome() + ", Custo: " + otimo.getCusto());

	}

}
