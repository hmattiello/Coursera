
public interface MecanicaJogo {
	public void setQtdeVidas(int vidas);
	public boolean estaVivo();
	public void acertouPalavra(String palavra, String palavraDigitada);
	public void somaPontos(String palavra);
	public int getQtdeVidas();
	public int getQtdePontos();
	public boolean acertou();
	public int getQtdePalavrasCertas();
}
