import java.util.Scanner;

public class verificacaoUsuario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

         int CODIGO_CORRETO = 1234;
         int SENHA_CORRETA = 9999;

        System.out.print("Digite o código do usuário: ");
        int codigo = scanner.nextInt();

        if (codigo != CODIGO_CORRETO) {
            System.out.println("Usuário inválido");
        } else {
            System.out.print("Digite a senha: ");
            int senha = scanner.nextInt();

            if (senha != SENHA_CORRETA) {
                System.out.println("Senha incorreta");
            } else {
                System.out.println("Acesso permitido");
            }

		}
        scanner.close();
	}
	
}
