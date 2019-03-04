import org.junit.Assert;
import org.junit.Test;

public class TesteMorteSubita {

	@Test
	public void testQtdeVidas() {
		MorteSubita jogo = new MorteSubita();
		jogo.setQtdeVidas(1);
		Assert.assertEquals(1,jogo.getQtdeVidas());
	}
	
	@Test
	public void testeEstaVivo() {
		MorteSubita jogo = new MorteSubita();
		jogo.setQtdeVidas(1);
		Assert.assertEquals(true, jogo.estaVivo());		
	}
	
	@Test
	public void testeAcertouPalavra() {
		MorteSubita jogo = new MorteSubita();
		jogo.setQtdeVidas(1);
		jogo.acertouPalavra("cachorro", "cachorro");
		Assert.assertEquals(true, jogo.acertou());		
	}
	
	@Test
	public void testeErrouPalavra() {
		MorteSubita jogo = new MorteSubita();
		jogo.setQtdeVidas(1);
		jogo.acertouPalavra("cachorro", "gato");
		Assert.assertEquals(false, jogo.acertou());		
	}
	
	@Test
	public void testeAcertouUmaPalavraPontos() {
		MorteSubita jogo = new MorteSubita();
		jogo.setQtdeVidas(1);
		jogo.acertouPalavra("cachorro", "cachorro");
		Assert.assertEquals(12, jogo.getQtdePontos());		
	}
	
	@Test
	public void testeAcertouDuasPalavraPontos() {
		MorteSubita jogo = new MorteSubita();
		jogo.setQtdeVidas(1);
		jogo.acertouPalavra("cachorro", "cachorro");
		jogo.acertouPalavra("gato", "gato");
		Assert.assertEquals(18, jogo.getQtdePontos());
		Assert.assertEquals(2, jogo.getQtdePalavrasCertas());
	}

}
