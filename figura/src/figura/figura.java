package figura;

public abstract class figura {
		
	private String cor;

	public figura(String cor) {
		this.cor = cor;
	}
		
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Figura [cor=" + cor + "]";
	}

}
