
public class veiculo {
	
	private String placa;
	private int ano;
	
	public veiculo(String placa, int ano) {
		super();
		this.placa = placa;
		this.ano = ano;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void exibirDados() {
		System.out.println("placa: " + placa);
		System.out.println("ano: " + ano);
	}

}
