import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoCompras {

	CarrinhoCompras carrinho;
	
	Produto produtoSemTamanho1;
	Produto produtoSemTamanho2;
	Produto produtoSemTamanho3;
	
	Produto produtoComTamanho1;
	Produto produtoComTamanho2;
	Produto produtoComTamanho3;
	
	@Before
	public void inicializaCarrinho() {
		carrinho = new CarrinhoCompras();
		
		produtoSemTamanho1 = new Produto("Guitarra Cort Vermelha",123,1650.65);
		produtoSemTamanho2 = new Produto("Violao Tagima",234,700.00);
		produtoSemTamanho3 = new Produto("Guitarra Cort Azul",123,1680.89);
		
		produtoComTamanho1 = new ProdutoComTamanho("Mizuno Wave Prophecy",345,400.50,40);
		produtoComTamanho2 = new ProdutoComTamanho("Mizuno Wave Prophecy",345,390.50,39);
		produtoComTamanho3 = new ProdutoComTamanho("Mizuno Wave Prophecy",345,400.50,40);
		
		carrinho.adicionaProdutosCarrinho(produtoSemTamanho1,3);
		carrinho.adicionaProdutosCarrinho(produtoSemTamanho1,2);
		carrinho.adicionaProdutosCarrinho(produtoSemTamanho2,2);
	}
	
	@Test
	public void testaProdutosCarrinho() {
		assertEquals(2,carrinho.retornaQuantidadeProdutosCarrinho());
	}
	
	@Test
	public void testaValorTotalCarrinho() {
		assertEquals(9653.25,carrinho.getPrecoCarrinho(),0);		
	}
	
	@Test
	public void retiraProdutoCarrinho() {
		carrinho.retiraProdutosCarrinho(produtoSemTamanho1, 4);
		assertEquals(1,carrinho.getQuantidadeItensProduto(produtoSemTamanho1));
	}
	
	@Test(expected=java.lang.NullPointerException.class)
	public void retiraTodoProdutoCarrinho() {
		carrinho.retiraProdutosCarrinho(produtoSemTamanho1, 5);
		assertEquals(0,carrinho.getQuantidadeItensProduto(produtoSemTamanho1));
	}
	
	@Test(expected=java.lang.AssertionError.class)
	public void retiraMaisProdutoCarrinho() {
		carrinho.retiraProdutosCarrinho(produtoSemTamanho1, 6);
		assertEquals(-1,carrinho.getQuantidadeItensProduto(produtoSemTamanho1));
	}
	
	@Test
	public void testaQuantidadeTotalItens() {
		assertEquals(7,carrinho.getTotalItensCarrinho());
	}
	
	@Test
	public void adicionaItensTamanhosDiferentes() {
		carrinho.adicionaProdutosCarrinho(produtoComTamanho1,2);
		carrinho.adicionaProdutosCarrinho(produtoComTamanho3,1);
		assertEquals(10,carrinho.getTotalItensCarrinho());
	}
	
	@Test
	public void totalItensTamanhosDiferentes() {
		carrinho.adicionaProdutosCarrinho(produtoComTamanho1,2);
		carrinho.adicionaProdutosCarrinho(produtoComTamanho3,1);
		assertEquals(4,carrinho.retornaQuantidadeProdutosCarrinho());
	}
	
	@Test
	public void valorTotalComItensComESemTamanhos() {
		carrinho.adicionaProdutosCarrinho(produtoComTamanho1,2);
		carrinho.adicionaProdutosCarrinho(produtoComTamanho3,1);
		assertEquals(10854.75,carrinho.getPrecoCarrinho(),0);
	}
	
}
