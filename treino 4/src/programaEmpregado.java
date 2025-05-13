import java.util.Scanner;

public class programaEmpregado {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite o nome: ");
        String nome = sc.nextLine();
        
        System.out.println("digite o salario: ");
        double salario = sc.nextDouble();
        
        empregado emp = new empregado(nome,salario);
        
        System.out.println("nome: " + emp.getNome());
        System.out.println("imposto a ser pago: " + emp.calcularImposto());
        
        sc.close();
        
	}
}
