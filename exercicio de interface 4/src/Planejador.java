
public class Planejador {
	
	public static void listarRapidas(ITarefa t, int max) {
		
        if (t.getDuracao() <= max) {
            System.out.println("- " + t.getNome() + " (" + t.getDuracao() + "h)");
        }
        
        if (t instanceof TarefaComposta tc) {
            for (ITarefa sub : tc.getSubtarefas())
            	listarRapidas(sub, max);
        }
    }
}
