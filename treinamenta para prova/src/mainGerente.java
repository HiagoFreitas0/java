
public class mainGerente {

	public static void main(String[] args) {
		
   Gerente g1 = new Gerente("Juliana", 40, "juliana@email.com", 0, 0);
   System.out.println(g1.getNome() + " recebe por ano: R$ " + g1.calcularSalariaAnual());

	}

}
