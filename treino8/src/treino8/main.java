package treino8;

public class main {

	public static void main(String[] args) {
		
		contaCorrente cc = new contaCorrente("João", 1000.0, 5.0);
        System.out.println("== Conta Corrente ==");
        cc.exibirDados();
        cc.depositar(500.0);
        cc.sacar(200.0);
        cc.exibirDados();
        
        System.out.println("\n== Conta Poupança ==");
        contaPoupanca cp = new contaPoupanca("Maria", 1500.0);
        cp.exibirDados();
        cp.depositar(300.0);
        cp.sacar(100.0);
        cp.exibirDados();
	}

}
