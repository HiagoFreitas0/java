
public class main {

	public static void main(String[] args) {
		
		carro carro = new carro("ABC-1234", 2022, "Corolla");
        moto moto = new moto("XYZ-5678", 2021, 250);

        carro.exibirDados();
        System.out.println();
        moto.exibirDados();

	}

}
