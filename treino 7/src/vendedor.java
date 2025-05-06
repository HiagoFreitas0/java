
public class vendedor extends funcionario{

	public vendedor(String nome,String cpf, double salarioBase) {
		super(nome,cpf,salarioBase);
	}

	@Override
	public double calcularSalarioFinal() {
		return salarioBase + (salarioBase * 0.1);
	}

	@Override
	public void exibirDados() {
        System.out.println("Cargo: Vendedor");
        System.out.println("Salário final: R$" + calcularSalarioFinal());
		
	}

}
