package treino8;

public class conta {
	
	private String titular;
	private double saldo;
	
	
	public conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar (double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("deposito de r$ " + valor + "realizado");
		} else {
			System.out.println("valor invalido para deposito");
		}
		
	}
	
	public void sacar(double valor) {
		
		if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
		
	}
	
	public void exibirDados() {
		System.out.println("titular: " + titular);
		System.out.println("saldo: " + saldo);
	}

}
