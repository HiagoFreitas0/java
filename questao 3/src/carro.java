
public class carro extends veiculo{
	
	private String modelo;
	
	public carro(String placa, int ano, String modlo) {
		super(placa, ano);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("modelo: " + modelo);
	}
}
