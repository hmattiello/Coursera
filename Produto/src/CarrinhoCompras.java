import java.util.HashMap;
import java.util.Map;

public class CarrinhoCompras {

	protected Map<Produto, Integer> carrinhoProdutos = new HashMap<>();
	
	public void adicionaProdutosCarrinho (Produto produto, int quantidade) {
		if ((carrinhoProdutos.containsKey(produto))) {
			final int quantidadeJaExistente;
			quantidadeJaExistente = carrinhoProdutos.get(produto) + quantidade;
			carrinhoProdutos.replace(produto, quantidadeJaExistente);
		}
		else {
			carrinhoProdutos.put(produto, quantidade++);
		}		
	}
	
	public void retiraProdutosCarrinho (Produto produto, int quantidade) {
		if (carrinhoProdutos.containsKey(produto)) {
			final int quantidadeJaExistente = carrinhoProdutos.get(produto);
			if (quantidadeJaExistente > quantidade) {
				carrinhoProdutos.replace(produto, quantidadeJaExistente-quantidade);
			}
			else if (quantidadeJaExistente == quantidade){
				carrinhoProdutos.remove(produto);
			}
		}		
	}
	
	public double getPrecoCarrinho() {
		double precoCarrinho =0;
		for(Produto produto : carrinhoProdutos.keySet()) {
			precoCarrinho += produto.getPreco() * carrinhoProdutos.get(produto);
		}
		return precoCarrinho;
	}
	
	public void imprimeProdutosCarrinho() {
		for(Produto produto : carrinhoProdutos.keySet()) {
			System.out.println(produto.getNome()+" - "+ carrinhoProdutos.get(produto));			
		}
	}
	
	public int retornaQuantidadeProdutosCarrinho() {
		return carrinhoProdutos.size();
	}
	
	public int getTotalItensCarrinho() {
		int totalItens = 0;
		for(Produto produto : carrinhoProdutos.keySet()) {
			totalItens += carrinhoProdutos.get(produto);
		}
		return totalItens;
	}
	
	public int getQuantidadeItensProduto(Produto produto) {
		return carrinhoProdutos.get(produto);
	}
	
}
