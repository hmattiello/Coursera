import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("Mattiello", "1234");
		assertEquals("Mattiello",u.getLogin());
	}
	
	@Test(expected=LoginException.class)
	public void loginFalha() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("Mattiello", "4567");
		assertEquals("Mattiello",u.getLogin());
	}
	
	@Test
	public void informacaoDoErro() {
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("Mattiello", "4567");
			fail();
		} catch (LoginException e) {
			assertEquals("Mattiello",e.getLogin());
		}		
	}

}
