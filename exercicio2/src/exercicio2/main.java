package exercicio2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println(" digite o valor das despesas: ");
		double despesas = sc.nextDouble();
		
		cliente clin = new cliente(nome, despesas);
		
		System.out.printf(" cliente: %s\n total com 10% de gorjeta: R$ %.2f\n",clin.getNome(),clin.calcularTotalComGorjeta());
		
		sc.close();

	}

}
