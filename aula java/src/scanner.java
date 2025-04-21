import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("nome: ");
		
		String nome = sc.nextLine();
		
		System.out.println("idade: ");
		int idade = sc.nextInt();
		
		System.out.println("valor: ");
		double valor = sc.nextDouble();
		sc.close();
		
		System.out.println("nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("valor: " + valor);

	}

}
