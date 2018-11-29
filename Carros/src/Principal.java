
public class Principal {

	public static void main(String[] args) {
		Corrida corridaDaAmizade = new Corrida(2000);
		
		corridaDaAmizade.adicionaCarro(new CarroSoma("Carro Soma 1",10,110));
		
		corridaDaAmizade.adicionaCarro(new CarroSoma("Carro Soma 2",8,140));
		
		corridaDaAmizade.adicionaCarro(new CarroMult("Carro Mult 1",1.7,100));
		
		corridaDaAmizade.adicionaCarro(new CarroMult("Carro Mult 2",1.4,115));
		
		corridaDaAmizade.umDoisTresEJa();

	}

}
