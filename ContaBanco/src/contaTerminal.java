import java.util.Scanner;

public class contaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite seu nome: ");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite o número da agência:");
        String agencia = sc.nextLine();
		
        System.out.println("Por favor, digite o número da conta:");
        int numero = sc.nextInt();
		
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = sc.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " + "Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
	}

}
