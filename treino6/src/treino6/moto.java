package treino6;

public class moto extends veiculo{
	
	private int cilindrada;

	public moto(String marca, String modelo, int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("cilindrada da mota: " + cilindrada + "cc");
	}

}
