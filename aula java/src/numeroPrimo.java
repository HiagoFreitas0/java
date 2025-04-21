import java.util.Scanner;

public class numeroPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o inicio do intervalo: ");
		int inicio = sc.nextInt();
		
		System.out.println("digite o fim do intervalo: ");
		int fim = sc.nextInt();
		
		System.out.println("numeros primos entre " + inicio + "e" + fim + ":");
		
		for(int num = inicio; num <= fim; num++ ) {
			if(ehprimo(num)) {
				System.out.println(num + " ");
			}
		}
		
		sc.close();
	}
	
	public static boolean ehprimo (int n) {
		if(n < 2)
		return false;
		for( int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0)
			return false;
		}
		return true;
	}
}
