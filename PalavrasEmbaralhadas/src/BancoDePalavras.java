import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {
	static private ArrayList<String> palavras = new ArrayList<>();
	private String palavraEscolhida;
	
	public void montaBancoDePalavras(){
		try{
			FileReader arquivoPalavras = new FileReader("palavras");
			BufferedReader lerArquivo = new BufferedReader(arquivoPalavras);
			String linha = lerArquivo.readLine();
			
			while(linha != null){
				palavras.add(linha);
				linha = lerArquivo.readLine();
			}

			arquivoPalavras.close();
		} catch (IOException e){
			System.err.println("Erro na abertura do arquivo: " + e.getMessage());
		} 
	}
	
	public void palavraAleatoria(){
		Random palavraAletoria = new Random();
		int idPalavra = palavraAletoria.nextInt(palavras.size());
		palavraEscolhida = palavras.get(idPalavra);		
	}
	
	public int getPalavrasInseridasBanco() {
		return palavras.size();
	}
	
	public String getPalavraEscolhida() {
		return palavraEscolhida;
	}
}
