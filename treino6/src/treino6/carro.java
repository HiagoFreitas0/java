package treino6;

public class carro extends veiculo{
	
	private int numeroDePortas;

	public carro(String marca, String modelo, int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("numero de portas: " + numeroDePortas);
	}

}
