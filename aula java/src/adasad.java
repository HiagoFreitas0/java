import java.util.Scanner;

public class adasad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha seu plano: básico, mídia, turbo");
        String plano = sc.nextLine().toLowerCase();
        
        if (plano.equals("básico")) {
            System.out.println("Plano Básico: 100 minutos de ligação.");
        } else if (plano.equals("mídia")) {
            System.out.println("Plano Mídia: 100 minutos de ligação + WhatsApp e Instagram grátis.");
        } else if (plano.equals("turbo")) {
            System.out.println("Plano Turbo: 100 minutos de ligação + WhatsApp e Instagram grátis + 5GB de YouTube.");
        } else {
            System.out.println("Plano inválido. Escolha entre básico, mídia ou turbo.");
        }
		

	}

}
