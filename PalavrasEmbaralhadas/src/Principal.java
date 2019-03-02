import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		BancoDePalavras bancoPalavras = new BancoDePalavras();
		FabricaEmbaralhador palavraEmbaralhada = new FabricaEmbaralhador();
		
		bancoPalavras.montaBancoDePalavras();
		System.out.println("Foram carregadas "+bancoPalavras.getPalavrasInseridasBanco() +" palavras");
		
		bancoPalavras.palavraAleatoria();
		System.out.println(bancoPalavras.getPalavraEscolhida());
		
		palavraEmbaralhada.determinaTipoEmbaralhar(bancoPalavras.getPalavraEscolhida());
		System.out.println(palavraEmbaralhada.getPalavraEmbaralhada());
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o seu nome!");
		String nome = in.nextLine();
		System.out.println("O seu nome é: "+nome);
		in.close();
		
	}

}
