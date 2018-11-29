import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCompra {

	@Test
	public void CompraAVista() {
		Compra c = new Compra(500);
		assertEquals(1,c.getNumeroParcelas());
		assertEquals(500,c.getValorTotal());
		assertEquals(500,c.getValorTotal());
	}
	
	@Test
	public void CompraParcelada() {
		Compra c = new Compra(4,250);
		assertEquals(4,c.getNumeroParcelas());
		assertEquals(1000,c.getValorTotal());
		assertEquals(250,c.getValorParcela());
	}

}
