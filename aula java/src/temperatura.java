import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("digite a temperatura em graus celsius para converter: ");
		double celsius = scanner.nextDouble();
		
		double Reumur = celsius * 0.8;
		double Kelvin = celsius + 1.8 + 32;
		double Rankine = celsius * 1.8 + 32 + 459.67;
		double Fahrenheit = celsius * 1.8 + 32;
		
		
		System.out.println("temperatuta em reumur: " + Reumur);
		System.out.println("temperatura em Kelvin: " + Kelvin);
		System.out.println("temperatura em Rankine: " + Rankine);
		System.out.println("temperatura em Fahrenheit: " + Fahrenheit);
		
		scanner.close();
	}

}
