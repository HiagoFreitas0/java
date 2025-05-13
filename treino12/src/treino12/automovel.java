package treino12;

public class automovel extends veiculo{

	private int numPassageiro;
	
	public automovel(String marca, String modelo, int numPassageiro) {
		super(marca, modelo);
		this.numPassageiro = numPassageiro;
	}

	public int getNumPassageiro() {
		return numPassageiro;
	}

	public void setNumPassageiro(int numPassageiro) {
		this.numPassageiro = numPassageiro;
	}

	@Override
	public String toString() {
		return super.toString() + " [numPassageiro] = " + numPassageiro;
	}
	

}
