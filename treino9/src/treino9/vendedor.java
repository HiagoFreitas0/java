package treino9;

public class vendedor extends funcionario{
	
	private double comissao;
	
	public vendedor(String nome, double salario, double comissao) {
		super(nome, salario);
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return getSalario() + comissao;
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Cargo: Vendedor");
        System.out.println("Comissão: R$ " + comissao);
        System.out.println("Salário Total: R$ " + calcularSalario());
	}
	
	
}
