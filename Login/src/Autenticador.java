
public class Autenticador {
	
	public Usuario logar(String login, String senha) throws LoginException{
		if(login.equals("Mattiello") && senha.equals("1234")) {
			return new Usuario(login);
		}
		throw new LoginException("O usuário e a senha não batem", login);
	}

}
