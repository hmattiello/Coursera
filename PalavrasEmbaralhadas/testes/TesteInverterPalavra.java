import org.junit.Assert;
import org.junit.Test;

public class TesteInverterPalavra {

	@Test
	public void testeInverterPalavra() {
		Embaralhador palavraEmbaralhada = new InverterPalavra();
		palavraEmbaralhada.EmbaralharPalavra("cachorro");
		Assert.assertEquals("orrohcac",palavraEmbaralhada.getPalavraEmbaralhada());	
	}

}
