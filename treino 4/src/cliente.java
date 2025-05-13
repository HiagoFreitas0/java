
public class cliente {
	
	private String nome;
	private double despesas;
	
	public cliente (String nome, double despesas){
		
		this.nome = nome;
		this.despesas = despesas;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDespesas() {
		return despesas;
	}

	public void setDespesas(int despesas) {
		this.despesas = despesas;
	}
	
	public double calcularTotalComGorjeta() {
		return despesas*1.10;
	}
}
