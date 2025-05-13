package treino11;

public class bolsista extends aluno{
	
	private double bolsa;
	
	public bolsista(String nome, int idade, String curso, double bolsa) {
		super(nome, idade, curso);
		this.bolsa = bolsa;
	}

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public String toString() {
		return "bolsista [bolsa=" + bolsa + "]";
	}

}
