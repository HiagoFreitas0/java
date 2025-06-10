
public class TarefaSimples implements ITarefa{
	
	private String nome;
    private int duracao;

    public TarefaSimples(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() { 
    	return nome; 
    }
    
    public int getDuracao() { 
    	return duracao;
    }

}
