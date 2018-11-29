import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteProduto {
	
	Produto p;
	Produto p2;
	Produto p3;
	
	@Before
	public void inicializaProduto() {
		p = new Produto("Guitarra Cort Vermelha",123,650.00);
		p2 = new Produto("Violao Tagima",234,700.00);
		p3 = new Produto("Guitarra Cort Azul",123,680.00);
	}
	
	@Test
	public void testaObtemCodigo() {
		p.getCodigo();
		assertEquals(123,p.getCodigo());		
	}
	
	@Test
	public void testaProdutoDiferente() {
		assertEquals(false,p.equals(p2));		
	}
	
	@Test
	public void testaProdutoIgual() {
		assertEquals(true,p.equals(p3));		
	}
	
	@Test
	public void testaPrecoProduto() {
		assertEquals(650.00,p.getPreco(),0);		
	}

}
