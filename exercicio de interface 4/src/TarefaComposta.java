import java.util.List;

public class TarefaComposta implements ITarefa{
	
	private String nome;
    private List<ITarefa> subtarefas;
	
    public TarefaComposta(String nome, List<ITarefa> subtarefas) {
        this.nome = nome;
        this.subtarefas = subtarefas;
    }

    public String getNome() { 
    	return nome; 
    }

    public int getDuracao() {
        int soma = 0;
        for (ITarefa t : subtarefas) 
        	soma += t.getDuracao();
            return soma;
    }

    public List<ITarefa> getSubtarefas() { 
    	return subtarefas; 
    }
    

}
