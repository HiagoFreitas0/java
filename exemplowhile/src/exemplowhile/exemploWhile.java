package exemplowhile;

import java.util.concurrent.ThreadLocalRandom;

public class exemploWhile {

	public static void main(String[] args) {
		double mesada = 50;
		
		while(mesada>0) {
			Double valorDoce = valorAleatorio();
			if(valorDoce > mesada)
				valorDoce = mesada;
			System.out.println("doce do valor: " + valorDoce + " adicionar no carrinho ");
			mesada = mesada - valorDoce;
			}
		System.out.println("mesada:" + mesada);
		System.out.println("joazinho gastou toda a sua mesada em doces");
		

	}
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2,8);
	}

}
