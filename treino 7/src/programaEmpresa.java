
public class programaEmpresa {

	public static void main(String[] args) {
		cliente cliente = new cliente("João", "111.111.111-11");
        gerente gerente = new gerente("Maria", "222.222.222-22", 5000.0);
        vendedor vendedor = new vendedor("Carlos", "333.333.333-33", 3000.0);

        System.out.println(" Cliente ");
        cliente.exibirDados();

        System.out.println("\n Gerente ");
        gerente.exibirDados();

        System.out.println("\n Vendedor ");
        vendedor.exibirDados();

	}

}
