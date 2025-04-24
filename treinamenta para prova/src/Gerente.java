
public class Gerente extends Funcionario{
	
	private double bonus;
	
	public Gerente(String nome, int idade, String email, double d, double e) {
		super(nome, idade, email,e);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double calcularSalariaAnual() {
		return super.calcularSalariaAnual() + bonus;
	}

	

	

}
