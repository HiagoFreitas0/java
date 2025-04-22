import java.util.Locale;
import java.util.Scanner;

public class altura {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        double maiorAltura = Double.MIN_VALUE;
	        double menorAltura = Double.MAX_VALUE;
	         double somaAlturaHomens = 0;
	        int contadorHomens = 0;
	        int contadorMulheres = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Pessoa " + i + ":");

	            System.out.print("Digite a altura (em metros): ");
	            double altura = scanner.nextDouble();

	      
	            System.out.print("Digite o sexo (1 para masculino, 2 para feminino): ");
	            int sexo = scanner.nextInt();

	            if (altura > maiorAltura) maiorAltura = altura;
	            if (altura < menorAltura) menorAltura = altura;

	         
	            if (sexo == 1) {
	                somaAlturaHomens += altura;
	                contadorHomens++;
	            } else if (sexo == 2) {
	                contadorMulheres++;
	            } else {
	                System.out.println("Sexo invalido");
	            }
	            System.out.println();
	        }

	        double mediaAlturaHomens = contadorHomens > 0 ? somaAlturaHomens / contadorHomens : 0;

	        System.out.println("Maior altura: " + maiorAltura + " m");
	        System.out.println("Menor altura: " + menorAltura + " m");
	        System.out.println("Média de altura dos homens: " + mediaAlturaHomens + " m");
	        System.out.println("Número de mulheres: " + contadorMulheres);

	        scanner.close();
	}
}
