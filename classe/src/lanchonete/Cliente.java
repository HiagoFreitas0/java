package lanchonete;

public class Cliente {
	
	public void escolherLanche() {//so cliente
		System.out.println("ESCOLHENDO O LANCHE");	
	}

	public void fazerPedido() {//so cliente
		System.out.println("FAZENDO O PEDIDO ");
	}
	
	public void pagarConta() {//so cliente
		System.out.println("PAGANDO A CONTA");
	}
	
	public void consultarSaldoAplicativo() {//so cliente
		System.out.println("CONSULTANDO SALDO NO APLICATIVO");
	}
	
	public void pegarPedidoBalcao() {//so cliente e o atendente 
		System.out.println("PEGANDO O PEDIDO NA BALCAO");
	}
}
