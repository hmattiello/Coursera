import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	
	private final List<Pizza> listaPizzasCarrinho;
	
	public CarrinhoCompras (){
		listaPizzasCarrinho = new ArrayList<>();
	}
	
	public int calculaPrecoTotal () {
		int precoTotal = 0;
		for (Pizza pizza : listaPizzasCarrinho) {
			precoTotal += pizza.preco;
		}
		return precoTotal;
	}
	
	void adicionaPizzaCarrinho (Pizza pizza) throws PizzaSemIngredienteException {
		if (pizza.qtdeIngredientes == 0) {
			throw new PizzaSemIngredienteException("Pizza de vento não pode!");
		}
		else
			listaPizzasCarrinho.add(pizza);				
	}
}
