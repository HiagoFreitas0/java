package lanchonete;

public class Atendente {

	public void servidoMesa() {//so o atendente 
		System.out.println("SERVINDO MESA");
	}
	
	public void pegarLancheCozinha() {//so o atendente e o cozinheiro
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	
	public void receberPagamento() {//so o atendente
		System.out.println("RECEBENDO PAGAMENTO");
	}
	
	public void trocarGas() {//so o atendente e o almoxarife
		System.out.println("ATENDENTE TROCANDO O GAS");
	}
	
	public void pegarPedidoBalcao() {//so o atendente
		System.out.println("PEGANDO O PEDIDO NA BALCAO");
	}
	
}
