import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestePizzaria {
	
	private Pizza criarTrastevere() {
		Pizza trastevere = new Pizza();
		trastevere.adicionaIngrediente("Bacon");
		trastevere.adicionaIngrediente("Mussarela");
		trastevere.adicionaIngrediente("Catupiry");
		trastevere.adicionaIngrediente("Palmito");
		trastevere.adicionaIngrediente("Azeitona");
		trastevere.adicionaIngrediente("Lombo");
		return trastevere;
	}
	
	private Pizza criarCaprese() {
		Pizza caprese = new Pizza();
		caprese.adicionaIngrediente("Tomate");
		caprese.adicionaIngrediente("Mussarela");
		caprese.adicionaIngrediente("Manjericão");
		return caprese;
	}
	
	private Pizza criarMussarela() {
		Pizza mussarela = new Pizza();
		mussarela.adicionaIngrediente("Azeitona");
		mussarela.adicionaIngrediente("Mussarela");
		return mussarela;
	}
	
	private Pizza criarPizzaVento() {
		Pizza pizzaVento = new Pizza();
		return pizzaVento;
	}
	
	@BeforeClass
	public static void apagaMapaIngredientesUtilizados() {
		Pizza.apagaMapaIngredientes();		
		assertEquals(0,Pizza.qtdeIngredientesMapa);		
	}
	
	@Test
	public void testQtdeIngredientesPizzaTrastevere() {
		Pizza trastevere = criarTrastevere();		
		assertEquals(6,trastevere.qtdeIngredientes);
	}

	@Test
	public void testPizza15Reais() {
		Pizza mussarela = criarMussarela();
		Assert.assertEquals(15,mussarela.getPreco());
	}

	@Test
	public void testPizza20Reais() {
		Pizza caprese = criarCaprese();			
		assertEquals(20,caprese.getPreco());
	}
	
	@Test
	public void testPizza23Reais() {
		Pizza trastevere = criarTrastevere();	
		assertEquals(23,trastevere.getPreco());
	}
	
	@Test
	public void testCarrinhoCompras() throws PizzaSemIngredienteException {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		Pizza trastevere = criarTrastevere();
		Pizza caprese = criarCaprese();
		Pizza mussarela = criarMussarela();
		carrinhoCompras.adicionaPizzaCarrinho(trastevere);
		carrinhoCompras.adicionaPizzaCarrinho(caprese);
		carrinhoCompras.adicionaPizzaCarrinho(mussarela);
		assertEquals(58,carrinhoCompras.calculaPrecoTotal());
	}	
	
	@Test(expected=PizzaSemIngredienteException.class)
	public void testAdicaoPizzaVento() throws PizzaSemIngredienteException{
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		Pizza pizzaVento = criarPizzaVento();
		carrinhoCompras.adicionaPizzaCarrinho(pizzaVento);
	}
}
