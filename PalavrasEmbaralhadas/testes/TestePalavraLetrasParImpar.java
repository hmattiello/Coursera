import org.junit.Assert;
import org.junit.Test;

public class TestePalavraLetrasParImpar {

	@Test
	public void testePalavraLetrasParImparQtdePar() {
		Embaralhador palavraEmbaralhada = new PalavraLetrasParImpar();
		palavraEmbaralhada.EmbaralharPalavra("cachorro");
		Assert.assertEquals("achcroor",palavraEmbaralhada.getPalavraEmbaralhada());
	}
	
	@Test
	public void testePalavraLetrasParImparQtdeImpar() {		
		Embaralhador palavraEmbaralhada = new PalavraLetrasParImpar();
		palavraEmbaralhada.EmbaralharPalavra("lhama");
		Assert.assertEquals("hlmaa",palavraEmbaralhada.getPalavraEmbaralhada());
	}

}
