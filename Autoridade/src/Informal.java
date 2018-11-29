
public class Informal implements FormatadorNome {

	private String nome;
	
	public Informal(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return this.nome;
	}

}
