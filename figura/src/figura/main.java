package figura;

public class main {

	public static void main(String[] args) {
		
		retangulo ret = new retangulo(5,3,"azul");
		
		System.out.println(ret.toString());
		
		Quadrado qua = new Quadrado(6,"vermelho");
		System.out.println(qua.toString());
		
		Triangulo tri = new Triangulo(2,3,"amarelo");
		System.out.println(tri.toString());
		
		Circulo cir = new Circulo(9,"verde");
		System.out.println(cir.toString());

	}

}
