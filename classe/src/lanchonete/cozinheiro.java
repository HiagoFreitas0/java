package lanchonete;

public class cozinheiro {

	public void adicionarLancheNoBalcao() {//cozinheiro e o atendente
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
	}
	
	public void adicionarSucoNoBalcao() {//cozinheiro e o atendente 
		System.out.println("ADICIONAR SUCO NO BALCAO");
	}
	
	public void adicionarComboNoBalcao() {//cozinheiro e o atendente
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	public void prepararLanche() {//so o cozinheiro
		System.out.println("PREPARANDO LANCHE HAMBURGUE");
	}
	
	public void prepararVitamina() {//so o cozinheiro
		System.out.println("SELECAO O PAO,SALADA, OVO, CARNE");
	}
	
	public void prepararCombo() {//so o cozinheiro
		prepararLanche();
		prepararVitamina();
	}
	
	public void selecionarIngredientesLanche() {//so o cozinheiro
		System.out.println("SELECIONANDO O PAO, SALADA, OVO E CARNE");
	}
	
	public void selecionarIngredientesVitaminas() {//so o cozinheiro
		System.out.println("SELECIONANDO FRUTA, LEITE E SUCO ");
	}
	
	public void lavarIngredientes() {//so o cozinheiro
		System.out.println("LAVANDO INGREDIENTES");
	}
	
	public void baterVitaminaLiquidificador() {//so o cozinheiro
		System.out.println("BATER VITAMINA NO LIQUIDIFICADOR");
	}
	
	public void fritarIngredientesLanche() {//so o cozinheiro
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUE");
	}
	
	public void pedirParaTrocarGas(Atendente meuAmigo) {//cozinheiro e o almoxarife
		meuAmigo.trocarGas();
	}
	
	public void pedirParaTrocarGas(Almoxarife meuAmigo) {//cozinheiro e o almoxarife
		meuAmigo.trocarGas();
	}
	
	public void pedirIngredientes(Almoxarife almoxarife) {//cozinheiro e o almoxarife
		almoxarife.entregarIngredientes();
	}

}
