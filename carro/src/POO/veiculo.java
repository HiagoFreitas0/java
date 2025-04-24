package POO;

public abstract class veiculo {
	
private String chassi;
	
	public String getchassi() {
	return chassi;
	}
	
	public void setchassi(String chassi) {
		
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public abstract void ligar();
}
