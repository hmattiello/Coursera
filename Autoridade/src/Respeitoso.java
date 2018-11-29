
public class Respeitoso implements FormatadorNome {
	
	private String sobrenome;
	private boolean masculino;
	
	public Respeitoso(String sobrenome, boolean masculino) {
		super();
		this.sobrenome = sobrenome;
		this.masculino = masculino;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (masculino) {
			return "Sr. "+this.sobrenome;
		}
		else {
			return "Sra. "+this.sobrenome;
		}
	}
}