package treino8;

public class contaCorrente extends conta{
	
	private double taxa;
	
	public contaCorrente(String titular, double saldo, double taxa) {
		super(titular, saldo);
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public void sacar(double valor) {
		
		double valorComTaxa = valor + taxa;
        if (valorComTaxa > 0 && getSaldo() >= valorComTaxa) {
            setSaldo(getSaldo() - valorComTaxa);
            System.out.println("Saque de R$ " + valor + " realizado com taxa de R$ " + taxa);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
		
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("tipo: conta corrente");
		System.out.println("taxa: R$ " + taxa);
	}
	
	
	
	

}
