import java.util.Random;

public class FabricaEmbaralhador {

	int embaralhador;
	
	public void determinaTipoEmbaralhar() {
		Random determinadorEmbaralhar = new Random();
		embaralhador = determinadorEmbaralhar.nextInt(50)+1;
		if (embaralhador % 2 == 0) {
			//PalavraLetrasParImpar
		}
		else {
			//Inverter Palavra
		}
	}
	

}
