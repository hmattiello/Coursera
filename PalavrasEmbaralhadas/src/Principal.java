import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String tipoJogo;
		String nomeJogador;
		String palavraDigitada;
		boolean modoJogo = false;
		
		BancoDePalavras bancoPalavras = new BancoDePalavras();
		FabricaEmbaralhador palavraEmbaralhada = new FabricaEmbaralhador();
		FabricaMecanicaJogo fabricaMecanicaJogo = new FabricaMecanicaJogo();
		MecanicaJogo mecanicaJogo = null;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o seu nome!");
		nomeJogador = in.nextLine();
		System.out.println("Vamos lá "+nomeJogador +" começaremos o jogo das palavras embaralhadas");
		
		
		do {
			System.out.println("");
			System.out.println("Escolha a sua opção de jogo");
			System.out.println("(1) - Morte Súbita. Errou, perdeu, acabou!");
			System.out.println("(2) - Três vidas. Você tem algumas chances de sobrevivência");
			tipoJogo = in.nextLine();
			if (tipoJogo.equals("1") || tipoJogo.equals("2")){
				modoJogo = true;
			}
			else {
				System.out.println("Erro! Digite 1 ou 2 apenas!");
			}
		} while (!modoJogo);
		
		mecanicaJogo = fabricaMecanicaJogo.mecanicaJogoEscolhida(tipoJogo);
		
		if (tipoJogo.equals("1")) {
			mecanicaJogo.setQtdeVidas(1);
		}
		else if (tipoJogo.equals("2")) {
			mecanicaJogo.setQtdeVidas(3);
		}
		
		System.out.println("OK! Vamos começar!");
		bancoPalavras.montaBancoDePalavras();
		System.out.println("");
		System.out.println("Foram carregadas "+bancoPalavras.getPalavrasInseridasBanco() +" palavras");
		System.out.println("");

		
		do {
			bancoPalavras.palavraAleatoria();
			palavraEmbaralhada.determinaTipoEmbaralhar(bancoPalavras.getPalavraEscolhida());
			System.out.println(nomeJogador +" você tem "+ mecanicaJogo.getQtdeVidas()+" vidas!");
			System.out.println("");
			System.out.println("Advinhe a palavra: "+palavraEmbaralhada.getPalavraEmbaralhada());
			palavraDigitada = in.nextLine();
			mecanicaJogo.acertouPalavra(bancoPalavras.getPalavraEscolhida(), palavraDigitada);
			
			if(mecanicaJogo.acertou()) {
				System.out.println("");
				System.out.println("Acertou!!");
				System.out.println(nomeJogador +" você tem "+ mecanicaJogo.getQtdePontos()+" pontos!");
				System.out.println(nomeJogador +" você acertou até agora "+ mecanicaJogo.getQtdePalavrasCertas() +"!");
			}
			else {
				System.out.println("");
				System.out.println("Erroooouuu!!");				
			}
		} while(mecanicaJogo.estaVivo());
		
		System.out.println("");
		System.out.println("Fim da linha para você, "+nomeJogador +"!!");
		System.out.println(nomeJogador + " você fez "+ mecanicaJogo.getQtdePontos()+" pontos!!");
		System.out.println(nomeJogador + " você acertou "+ mecanicaJogo.getQtdePalavrasCertas()+" palavras no total!!");
		
		in.close();
	
	}	

}
