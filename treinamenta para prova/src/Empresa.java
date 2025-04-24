import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nome;
	private List<Funcionario> funcionarios;
	
	public Empresa (String nome) {
		this.nome = nome;
		this.funcionarios = new ArrayList<>();
	}
	
	public void adicionarFuncianorio(Funcionario f) {
		funcionarios.add(f);
	}
	
	public void mostrarFolhaPagamento() {
		System.out.println(" folha de pagamento: " + nome);
		
		for(Funcionario f : funcionarios) {
			System.out.println("-" + f.getNome() + " salario anual: R$" + f.calcularSalariaAnual());
		}
	}

}
