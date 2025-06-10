
public class GeneSimples implements IGene{
	
	private String sequencia;

	public GeneSimples(String sequencia) {
		this.sequencia = sequencia;
	}
	
	public String getSequencia() { 
		return sequencia; 
	}

    public int getForca() {
        return (int) sequencia.chars().distinct().count();
    }
}
