import java.util.HashMap;

public class LoginSystem {
	
	private HashMap<String, String> usuarios;

    public LoginSystem() {
        usuarios = new HashMap<>();
    }
	
	public void cadastrarUsuario(String usuario, String senha) {
		if (usuarios.containsKey(usuario)) {
	        System.out.println("Usuário já existe");
	    } else {
	        usuarios.put(usuario, senha);
	        System.out.println("Usuário cadastrado com sucesso");
	    }
	}
	
	public Boolean autenticar(String usuario, String senha) {
		if (usuarios.containsKey(usuario)) {
	        return usuarios.get(usuario).equals(senha);
	    }
	    return false;
	}
}
