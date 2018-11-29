
public class Autoridade {

	private String nome;
	private String sobrenome;
	FormatadorNome formatador;
	
	public Autoridade(FormatadorNome formatador) {
		this.formatador = formatador;
	}

	public String getTratamento() {
		return formatador.formatarNome(nome, sobrenome);
	}

}
