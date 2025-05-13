package figura;

public class Circulo extends figura{
	
	private double raio;

	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		return Math.PI * raio * raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + "]";
	}

}
