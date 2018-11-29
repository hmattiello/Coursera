import java.util.HashMap;

public class Pizza {

	String ingrediente;
	int preco;
	static int qtdeIngredientesMapa = 0;
	int qtdeIngredientes = 0;
	
	static HashMap<String, Integer> mapaIngredientes = new HashMap<String, Integer>();
	
	void adicionaIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
		contabilizaIngrediente(ingrediente);
		qtdeIngredientes++;
		getPreco();
	}
	
	
	public static void imprimirMapaIngredientes() {
		System.out.println("Quantidade utilizada de cada ingrediente: " +mapaIngredientes.toString());
	}
	
	public int getPreco() {
		if (qtdeIngredientes >=1 && qtdeIngredientes <=2){
			preco = 15;
		}
				
		else if (qtdeIngredientes >=3 && qtdeIngredientes <=5){
			preco = 20;
		}
		else if (qtdeIngredientes >=6) {
			preco = 23;
		}
		return preco;
	}
	
	static void contabilizaIngrediente(String ingrediente) {
		int valorRetornadoMapa;
		if (mapaIngredientes.containsKey(ingrediente)) {
			valorRetornadoMapa = mapaIngredientes.get(ingrediente) + 1;
			mapaIngredientes.replace(ingrediente, valorRetornadoMapa);
		}
		else {
			mapaIngredientes.put(ingrediente,1);
		}
		qtdeIngredientesMapa++;		
	}
	
	static void apagaMapaIngredientes() {
		mapaIngredientes.clear();
		qtdeIngredientesMapa=0;
	}
	
}
