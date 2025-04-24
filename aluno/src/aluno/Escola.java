package aluno;

public class Escola {

	public static void main(String[] args) {
		aluno mariazinha = new aluno();
		//nao vai funcionar pq esta privado
		//ai usa o get e o set para acessar essas variaveis
		//felipe.nome = "Felipe";
		//felipe.idade = 8;
		
		mariazinha.setNome("Mariazinha");
		mariazinha.getNome();
		
		mariazinha.getIdade();
		mariazinha.setIdade(15);
		
		System.out.println(" o aluno " + mariazinha.getNome() + "tem " + mariazinha.getIdade() + " anos ");

	}

}
