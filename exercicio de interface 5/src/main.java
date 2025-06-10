import java.util.List;

public class main {

	public static void main(String[] args) {
		
		IForma f1 = new Circulo(2);
        IForma f2 = new Retangulo(3, 4);
        IForma comp = new ComposicaoForma(List.of(f1, f2));
        System.out.println(comp.getDescricao());
        System.out.println("Área total: " + comp.getArea());

	}

}
