
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","Sao paulo", 11),
	RIO_JANEIRO ("RJ","Rio de Janeiro", 15),
	PIAUI ("PI","Piaui", 20),
	MARANHAO ("MA","Maranhao", 23),
	TOCANTINS ("TO","Tocantins", 24);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getIbge() {
		return ibge;
	}

	public void setIbge(int ibge) {
		this.ibge = ibge;
	}
}
