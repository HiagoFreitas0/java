
public abstract class funcionario extends pessoa{
	
	protected double salarioBase;
	
	public funcionario(String nome,String cpf, double salarioBase) {
		super(nome);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public abstract double calcularSalarioFinal();
	
}
