package treino6;

public class main {

	public static void main(String[] args) {
		
		carro cr = new carro("vowtsvagen","fusca",4);
		moto mt = new moto("honda","cg 160",160);
		
		System.out.println("carro: ");
		carro.exibirDados();
		
		System.out.println("\nDados da moto:");
        moto.exibirDados();

	}

}
