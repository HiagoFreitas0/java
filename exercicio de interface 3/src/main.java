
public class main {

	public static void main(String[] args) {
		
		IGene a = new GeneSimples("ATCG");
        IGene b = new GeneSimples("AACG");
        IGene m = new GeneMutante(a, b, "A");

        System.out.println("Mutado: " + m.getSequencia());
        System.out.println("Mais forte: " + Genetica.maisForte(m).getSequencia());
    }

}
