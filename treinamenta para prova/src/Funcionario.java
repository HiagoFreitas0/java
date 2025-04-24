
public class Funcionario extends pessoa{
	
	private double salario;
	
	public Funcionario(String nome, int idade, String email, double d) {
		super(nome, idade, email);
		this.salario = salario;
	}
	

	public double calcularSalariaAnual() {
		
		return salario *12;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}

