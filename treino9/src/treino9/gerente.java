package treino9;

public class gerente extends funcionario{
	
	private double bonus;
	
	public gerente(String nome, double salario, double bonus) {
		super(nome, salario);
		this.bonus = bonus;
	}

	@Override
	public double calcularSalario() {
		return getSalario() + bonus;
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Cargo: Gerente");
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário Total: R$ " + calcularSalario());
	}

}
