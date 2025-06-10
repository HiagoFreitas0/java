
public class Circulo implements IForma{
	
	private double raio;
	
    public Circulo(double raio) { 
    	this.raio = raio; 
    }
    
    public double getArea() { 
    	return Math.PI * raio * raio;
    }
    
    public String getDescricao() { 
    	return "Círculo (" + raio + ")"; 
    }

}
