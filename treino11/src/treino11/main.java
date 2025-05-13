package treino11;

public class main {

	public static void main(String[] args) {
		
		pessoa p = new pessoa("João", 25);
        aluno a = new aluno("Maria", 20, "Engenharia");
        bolsista b = new bolsista("Pedro", 22, "Computação", 1500.0);

        System.out.println(p);
        System.out.println(a);
        System.out.println(b);
	}

}
