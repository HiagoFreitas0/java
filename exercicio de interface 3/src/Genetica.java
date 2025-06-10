
public class Genetica {
	
	public static IGene maisForte(IGene g) {
        if (!(g instanceof GeneMutante m)) 
        	return g;
        IGene f1 = maisForte(m.g1);
        IGene f2 = maisForte(m.g2);
        return f1.getForca() > f2.getForca() ? f1 : f2;
    }
}
