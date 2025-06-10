
public class VisualizadorSistema {
	
	public static void imprimir(IArquivoSistema arq, int nivel) {
		
        String prefixo = "  ".repeat(nivel);
        System.out.println(prefixo + (arq instanceof Pasta ? "📁 " : "📄 ") + arq.getNome() + " (" + arq.getTamanho() + " bytes)");
        if (arq instanceof Pasta p) {
            for (IArquivoSistema sub : p.getConteudo()) {
                imprimir(sub, nivel + 1);
            }
        }
    }
}
