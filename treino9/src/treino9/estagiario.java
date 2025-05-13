package treino9;

public class estagiario extends funcionario{

	public estagiario(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularSalario() {
		return getSalario();
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Cargo: Estagiário");
        System.out.println("Salário Total: R$ " + calcularSalario());
	}
}
