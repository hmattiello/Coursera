
public class TresVidas implements MecanicaJogo {
	
	private int pontos = 0;
	private int vidas;
	private boolean acertou = false;
	private int qtdePalavrasCertas = 0;
	
	@Override
	public void setQtdeVidas(int vidas) {
		this.vidas = vidas;
	}

	@Override
	public boolean estaVivo() {
		if (vidas > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void acertouPalavra(String palavra, String palavraDigitada) {
		if (palavra.equals(palavraDigitada)) {
			acertou = true;
			somaPontos(palavra);
			qtdePalavrasCertas ++;
		}
		else {
			vidas--;
			acertou = false;
		}

	}

	@Override
	public void somaPontos(String palavra) {
		pontos += palavra.length();
	}
	
	@Override
	public int getQtdeVidas() {
		return vidas;
	}
	
	@Override
	public int getQtdePontos() {
		return pontos;
	}
	
	@Override
	public boolean acertou() {
		return acertou;
	}
	
	@Override
	public int getQtdePalavrasCertas() {
		return qtdePalavrasCertas;
	}

}
