
public class Produto {
	
	protected String nome;
	protected int codigo;
	protected double preco;
	
	public Produto (String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if (this.getCodigo() == ((Produto)o).getCodigo()) {
			result = true;
		}
		return result;		
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public String getNome() {
		return nome;
	}
	
}
