
public class Arquivo implements IArquivoSistema{

	private String nome;
    private int tamanho;
  
	public Arquivo(String nome, int tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}

	public String getNome(){ 
		return nome; 
	}
	
	public int getTamanho() { 
		return tamanho; 
	}
}
