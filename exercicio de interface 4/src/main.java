import java.util.List;

public class main {
	
	public static void main(String[] args) {
        ITarefa t1 = new TarefaSimples("Ler artigo", 2);
        ITarefa t2 = new TarefaSimples("Escrever resumo", 4);
        ITarefa comp = new TarefaComposta("Trabalho", List.of(t1, t2));
        Planejador.listarRapidas(comp, 3);
    }
}
