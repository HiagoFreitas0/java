package treino8;

public class contaPoupanca extends conta{

	public contaPoupanca(String titular, double saldo) {
		super(titular, saldo);
	}

	@Override
	public void sacar(double valor) {
		if (valor > 0 && getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$ " + valor + " realizado na poupança");
        } else {
            System.out.println("Saldo insuficiente ou valor invalido");
        }
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("tipo: conta poupanca");
	}
}
