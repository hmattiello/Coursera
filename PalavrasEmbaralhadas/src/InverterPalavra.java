
public class InverterPalavra implements Embaralhador {
	
	String palavraEmbaralhada;
	
	@Override
	public void EmbaralharPalavra(String palavra) {
		StringBuilder sb = new StringBuilder(palavra);
		sb.reverse();
		palavraEmbaralhada = sb.toString();
	}
	
	public InverterPalavra() {
		super();
	}

	@Override
	public String getPalavraEmbaralhada() {
		return palavraEmbaralhada;
	}

}
