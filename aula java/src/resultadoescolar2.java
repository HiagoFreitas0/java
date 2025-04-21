
public class resultadoescolar2 {

	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "aprovado" : nota >=5 && nota <7 ? "recuperacao" : "reprovado";
		System.out.println(resultado);

	}

}
