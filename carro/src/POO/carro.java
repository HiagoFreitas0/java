package POO;

public class carro extends veiculo {
	
	public void ligar() {
		conferindoCambio();
		confereCombustivel();
		System.out.println("carro ligar");
	}
	
	private void confereCombustivel() {
		System.out.println("conferindo combustivel");
	}
	
	private void conferindoCambio() {
		System.out.println("camboi no p ta ok");
	}

}
