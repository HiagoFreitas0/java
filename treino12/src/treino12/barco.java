package treino12;

public class barco extends veiculo{

	private double comprimento;
	
	public barco(String marca, String modelo, double comprimento) {
		super(marca, modelo);
		this.comprimento = comprimento;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	@Override
	public String toString() {
		return super.toString() + " [comprimento = " + comprimento + " metros " + "]";
	}

}
