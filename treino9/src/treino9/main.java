package treino9;

public class main {

	public static void main(String[] args) {
		
		System.out.println("== Gerente ==");
        gerente gerente = new gerente("João", 5000.0, 1000.0);
        gerente.exibirDados();

        System.out.println("\n== Vendedor ==");
        vendedor vendedor = new vendedor("Maria", 3000.0, 500.0);
        vendedor.exibirDados();

        System.out.println("\n== Estagiário ==");
        estagiario estagiario = new estagiario("Pedro", 1200.0);
        estagiario.exibirDados();
	}
}
