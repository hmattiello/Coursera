
public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		p.empilhar("Henrique");
		p.empilhar("Fernanda");
		p.empilhar("Jurema");
		
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		Object [] arrayElementos = p.getElementos();
		System.out.println(arrayElementos.length);
		arrayElementos[1] = "Outro";
		
		//p.setTopo(6);
		
		//Desempilhando
		System.out.println("----------------------");
		System.out.println(p.desempilhar().toString().toUpperCase());
		System.out.println(p.topo().toString().toUpperCase());
		System.out.println(p.tamanho());
		
		System.out.println(p.getElementos().length);
	}

}
