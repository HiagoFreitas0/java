import java.util.List;

public class main {

	public static void main(String[] args) {
		
		IArquivoSistema txt = new Arquivo("resumo.txt", 100);
        IArquivoSistema img = new Arquivo("foto.jpg", 200);
        IArquivoSistema imagens = new Pasta("imagens", List.of(img));
        IArquivoSistema docs = new Pasta("documentos", List.of(txt, imagens));
        VisualizadorSistema.imprimir(docs, 0);
	}
}
