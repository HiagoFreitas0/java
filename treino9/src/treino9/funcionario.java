package treino9;

public abstract class funcionario {
	
	private String nome;
	private double salario;
	
	public funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double calcularSalario();
	
	public void exibirDados() {
		System.out.println("nome: " + nome);
		System.out.println("salario base: " + salario);
	}
}
