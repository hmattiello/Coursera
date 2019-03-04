
public class FabricaMecanicaJogo {
	
	String escolhaJogador;
	
	public MecanicaJogo mecanicaJogoEscolhida (String escolhaJogador) {
		this.escolhaJogador = escolhaJogador;
		if (escolhaJogador.equals("1")) {
			return new MorteSubita();	
		}
		else {
			return new TresVidas();
		}
	}

	
}
