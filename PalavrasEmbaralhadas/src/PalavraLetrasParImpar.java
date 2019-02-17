
public class PalavraLetrasParImpar implements Embaralhador {
	
	String palavraEmbaralhada;
	private boolean isPar = false;
	
	@Override
	public void EmbaralharPalavra(String palavra) {
		
		verificarQtdeLetrasPalavraPar(palavra);
		StringBuilder sb = new StringBuilder();
		
		if (isPar==true) {
			for(int i = 0; i < palavra.length(); i++){
				if(i == palavra.length()){
	                sb.append(palavra.charAt(i));
	            }	
				else if(i % 2 == 0){
	                sb.append(palavra.charAt(i+1));                
	            }
				else {
					sb.append(palavra.charAt(i-1));
				}
	        }
		}
		else {
			for(int i = 0; i < palavra.length(); i++){
				if(i == palavra.length()-1){
	                sb.append(palavra.charAt(i));
	            }	
				else if(i % 2 == 0){
	                sb.append(palavra.charAt(i+1));                
	            }
				else {
					sb.append(palavra.charAt(i-1));
				}
	        }
		}
        palavraEmbaralhada = sb.toString();
	}


	@Override
	public String getPalavraEmbaralhada() {
		return palavraEmbaralhada;
	}
	
	public int getTamanhoPalavraEmbaralhada() {
		return palavraEmbaralhada.length();
	}
	
	private boolean verificarQtdeLetrasPalavraPar(String palavra) {
		if (palavra.length() % 2 == 0) {
			isPar = true;
		}
		return isPar;
	}

}
