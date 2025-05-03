package exercicio1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" digite o seu nome: ");
			String nome = sc.nextLine();
			
			System.out.println(" digite o seu salario: ");
			double salario = sc.nextDouble();
			
			Empregado emp = new Empregado(nome, salario);
			
			System.out.printf(" empregado: %s\n imposto de renda a ser pago: R$ %.2f\n",emp.getNome(),emp.calcularImposto());
			
			sc.close();
		}
}

