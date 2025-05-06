package treino5;

import java.util.Scanner;

public class programaProduto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nome do produto: ");
		String nome = sc.nextLine();
		
		System.out.println("preco: ");
		double preco = sc.nextDouble();
		
		System.out.println("quantidade: ");
		int quantidade = sc.nextInt();
		
		produto pd = new produto(nome,preco,quantidade);
		
		System.out.println("total a pagar: " + pd.calcularTotal());
		
		sc.close();

	}

}
