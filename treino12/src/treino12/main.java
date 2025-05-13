package treino12;

public class main {

	public static void main(String[] args) {
		
		veiculo v = new veiculo("Ford", "Fiesta");
        automovel a = new automovel("Toyota", "Corolla", 5);
        barco b = new barco("Yamaha", "JetSki", 3.2);
		
		System.out.println(v);
		System.out.println(a);
		System.out.println(b);
	}

}
