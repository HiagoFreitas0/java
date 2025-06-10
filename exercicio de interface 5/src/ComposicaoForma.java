import java.util.List;

public class ComposicaoForma implements IForma{
	
	private List<IForma> formas;
	
    public ComposicaoForma(List<IForma> formas) { 
    	this.formas = formas; 
    }

    public double getArea() {
        double total = 0;
        for (IForma f : formas) 
        	total += f.getArea();
        return total;
    }

    public String getDescricao() {
        StringBuilder sb = new StringBuilder("Composição:\n");
        for (IForma f : formas) 
        	sb.append("  - ").append(f.getDescricao()).append("\n");
        return sb.toString();
    }

}
