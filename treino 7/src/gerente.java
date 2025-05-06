
public class gerente extends funcionario{

	public gerente(String nome,String cpf, double salarioBase) {
		super(nome,cpf,salarioBase);
		
	}

	@Override
	public double calcularSalarioFinal() {
		return salarioBase + (salarioBase * 0.2);
	}

	@Override
	public void exibirDados() {
		System.out.println("Gerente: " + nome);
        System.out.printf("Salário final: R$ %.2f%n", calcularSalarioFinal());
	}

}
