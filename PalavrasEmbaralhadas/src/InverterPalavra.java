
public class InverterPalavra implements Embaralhador {
	
	String palavraEmbaralhada;
	
	@Override
	public void EmbaralharPalavra(String palavra) {
		StringBuffer sb = new StringBuffer(palavra);
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
