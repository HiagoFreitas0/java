import java.util.Scanner;

public class programaCilente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Digite o total de despesas: ");
        double despesas = sc.nextDouble();

        cliente cliente = new cliente(nome, despesas);
        
        System.out.println("Cliente: " + cliente.getNome());
        System.out.printf("Valor a ser pago com gorjeta: R$%.2f%n", cliente.calcularTotalComGorjeta());

        sc.close();

	}

}
