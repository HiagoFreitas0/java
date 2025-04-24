
public class TesteLogin {
    public static void main(String[] args) {
        LoginSystem sistema = new LoginSystem();

        sistema.cadastrarUsuario("joao", "1234");
        sistema.cadastrarUsuario("ana", "abcd");

        System.out.println("Login joao: " + sistema.autenticar("joao", "1234")); 
        System.out.println("Login ana (senha errada): " + sistema.autenticar("ana", "errada")); 
        System.out.println("Login usuario inexistente: " + sistema.autenticar("maria", "xyz")); 
    }
}
