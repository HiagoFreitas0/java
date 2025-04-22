package exemplowhile;

import java.util.Random;

public class exemplodowhile {

	public static void main(String[] args) {
			System.out.println("discando...");
			
			do {
				System.out.println("telefone tocando");
			}while(tocando());
			
			System.out.println("alo !!!");
		}
		private static boolean tocando() {
			
			boolean atendeu = new Random().nextInt(10)==1;
			System.out.println("atendeu?" + atendeu);
			return  atendeu;
		}
	}