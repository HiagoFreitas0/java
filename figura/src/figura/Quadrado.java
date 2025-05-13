package figura;

public class Quadrado extends retangulo{

	public Quadrado(double lado, String cor) {
		super(lado, lado, cor);
	}

	@Override
	public String toString() {
		return "Quadrado [getLado1()=" + getLado1() + ", getLado2()=" + getLado2() + ", area()=" + area()
				+ ", toString()=" + super.toString() + ", getCor()=" + getCor() + "]";
	}
}
