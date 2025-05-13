
public class moto extends veiculo{
	
	private int cilindrada;
	
	public moto(String placa, int ano, int cilindrada) {
		super(placa, ano);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("cilindrada: " + cilindrada);
	}
}
