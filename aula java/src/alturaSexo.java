import java.util.Scanner;

public class alturaSexo {

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

            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            if (altura > maiorAltura) maiorAltura = altura;
            if (altura < menorAltura) menorAltura = altura;

            if (sexo == 'M') {
                somaAlturaHomens += altura;
                contadorHomens++;
            } else if (sexo == 'F') {
                contadorMulheres++;
            } else {
                System.out.println("Sexo inválido. Ignorando essa entrada.");
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
