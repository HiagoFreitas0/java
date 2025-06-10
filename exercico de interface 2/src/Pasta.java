import java.util.List;

public class Pasta implements IArquivoSistema{

	private String nome;
    private List<IArquivoSistema> conteudo;
	
	public Pasta(String nome, List<IArquivoSistema> conteudo) {
		this.nome = nome;
		this.conteudo = conteudo;
	}
	
	public String getNome() { 
		return nome; 
	}
	
	public int getTamanho() {
        int soma = 0;
        for (IArquivoSistema a : conteudo) 
        	soma += a.getTamanho();
        return soma;
    }
	
	 public List<IArquivoSistema> getConteudo() {
		 return conteudo;
	 }
}
