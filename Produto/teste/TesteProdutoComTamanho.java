import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {

	Produto p1;
	Produto p2;
	Produto p3;
	
	@Before
	public void inicializaProdutoComTamanho() {
		p1 = new ProdutoComTamanho("Mizuno Wave Prophecy",345,400.50,40);
		p2 = new ProdutoComTamanho("Mizuno Wave Prophecy",345,400.50,39);
		p3 = new ProdutoComTamanho("Mizuno Wave Prophecy",345,400.50,40);
	}
	
	
	@Test
	public void testaProdutosIguais() {
		assertEquals(true,p1.equals(p3));	
	}
	
	@Test
	public void testaProdutosDiferentes() {
		assertEquals(false,p1.equals(p2));		
	}

}
