
public class Retangulo implements IForma{
	
	private double l, a;
	
    public Retangulo(double l, double a) {
        this.l = l; 
        this.a = a;
    }
    
    public double getArea() { 
    	return l * a; 
    
    }
    public String getDescricao() { 
    	return "Retângulo (" + l + "x" + a + ")"; 
    }

}
