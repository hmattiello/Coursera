import java.util.Random;

public class FabricaEmbaralhador {
	
	String palavraParaEmbaralhar;
	BancoDePalavras palavra;
	
	String palavraEmbaralhada;
	
	public void determinaTipoEmbaralhar(String palavraParaEmbaralhar) {
		this.palavraParaEmbaralhar = palavraParaEmbaralhar;
		Random escolheEmbaralhador = new Random();
		int idEmbaralhador = escolheEmbaralhador.nextInt(2);
		if (idEmbaralhador == 0){
			Embaralhador embaralhador = new InverterPalavra();
			embaralhador.EmbaralharPalavra(palavraParaEmbaralhar);
			palavraEmbaralhada = embaralhador.getPalavraEmbaralhada();
		}
		else {
			Embaralhador embaralhador = new PalavraLetrasParImpar();
			embaralhador.EmbaralharPalavra(palavraParaEmbaralhar);
			palavraEmbaralhada = embaralhador.getPalavraEmbaralhada();
		}
	}
	
	public String getPalavradoBanco() {
		return palavra.getPalavraEscolhida();
	}
	
	public String getPalavraEmbaralhada() {
		return palavraEmbaralhada;
	}

}
