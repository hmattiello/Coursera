
public class ProdutoComTamanho extends Produto {
	
	private int tamanho = 0;

	public ProdutoComTamanho(String nome, int codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	@Override
	public boolean equals(Object o)
	{
		boolean result = false;
		if ((this.getCodigo() == ((Produto)o).getCodigo()) && (this.getTamanho() == ((ProdutoComTamanho)o).getTamanho())) {
					result = true;
				}			
			return result;
	}
}
