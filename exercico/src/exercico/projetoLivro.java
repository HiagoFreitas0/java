package exercico;

public class projetoLivro {

	public static void main(String[] args) {
		pessoa1 [] p = new pessoa1[3];
		livro [] l = new livro[3];
		
		p[0] = new pessoa1("pedro" , 22, "m");
		p[1] = new pessoa1("hiago", 19, "m");
		p[2] = new pessoa1("isaac", 19, "m");
		
		l[0] = new livro("aprendendo java", "joao", 300, p[0]);
		l[1] = new livro("usando faca", "jose", 200, p[1]);
		l[2] = new livro("com ser gay", "pablo", 100, p[2]);
		
		
		l[0].abrir();
		l[0].folhear(100);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
		
		l[1].abrir();
		l[1].folhear(200);
		l[1].avancarPag();
		System.out.println(l[1].detalhes());
	}

}
