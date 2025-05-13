package treino11;

public class aluno extends pessoa{
	
	private String curso;
	
	public aluno(String nome, int idade, String curso) {
		super(nome, idade);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "aluno [curso=" + curso + "]";
	}

}
