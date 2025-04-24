package exercico;

public class livro implements publicacao{
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private pessoa1 leitor;
	
	
	public String detalhes() {
		return "livro\n titulo = " + titulo + "\n autor = " + autor + "\n totPaginas = " + totPaginas + "\n pagAtual = " + pagAtual
				+ "\n aberto = " + aberto + "\n leitor = " + leitor.getNome() +
				"\n idade = " + leitor.getIdade() +
				"\n sexo = " + leitor.getSexo();
	}


	public livro(String titulo, String autor, int totPaginas, pessoa1 leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getTotPaginas() {
		return totPaginas;
	}


	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}


	public int getPagAtual() {
		return pagAtual;
	}


	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}


	public boolean isAberto() {
		return aberto;
	}


	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}


	public pessoa1 getLeitor() {
		return leitor;
	}


	public void setLeitor(pessoa1 leitor) {
		this.leitor = leitor;
	}


	@Override
	public void abrir() {
		this.aberto = true;
		
	}


	@Override
	public void fechar() {
		this.aberto = false;
	}


	@Override
	public void folhear(int p) {
		if(p > this.totPaginas) {
			this.pagAtual = 0;
		}else {
			this.pagAtual = p;
		}
	}


	@Override
	public void avancarPag() {
		this.pagAtual = pagAtual + 1;
		
	}


	@Override
	public void voltarPag() {
		this.pagAtual = pagAtual - 1;
		
	}

	
	
	
	

}
