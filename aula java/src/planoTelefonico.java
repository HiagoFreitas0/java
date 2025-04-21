import java.util.Scanner;

public class planoTelefonico {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha seu plano: básico, mídia, turbo");
        String plano = sc.nextLine();
        
        switch (plano) {
            case "básico":
                System.out.println("Plano Básico: 100 minutos de ligação.");
                break;
            case "mídia":
                System.out.println("Plano Mídia: 100 minutos de ligação + WhatsApp e Instagram grátis.");
                break;
            case "turbo":
                System.out.println("Plano Turbo: 100 minutos de ligação + WhatsApp e Instagram grátis + 5GB de YouTube.");
                break;
            default:
                System.out.println("Plano inválido. Escolha entre básico, mídia ou turbo.");
        }
	}
}
