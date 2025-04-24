
public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("Tech Solutions");

        Funcionario f1 = new Funcionario("Lucas", 28, "lucas@email.com", 3000.00);
        Gerente g1 = new Gerente("Mariana", 35, "mariana@email.com", 5000.00, 8000.00);

        e1.adicionarFuncianorio(f1);
        e1.adicionarFuncianorio(g1);

        e1.mostrarFolhaPagamento();
    }
}

