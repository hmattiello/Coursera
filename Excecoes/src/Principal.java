
public class Principal {

	public static void main(String[] args) {
		a(-100);
		System.out.println("Terminando execução de main()");

	}
	
	public static void a(int i){
		System.out.println("Executanto a() com "+i);
		try {
			b(i);
		} catch (Exception e) {
			System.out.println("tratanto a exceção: "+e.getMessage());
		}
		System.out.println("Terminando execução de a()");
	}
	
	public static void b (int i) throws Exception {
		System.out.println("Executanto b() com "+i);
		if (i >0)
			throw new Exception("mensagem");
		System.out.println("Terminando execução de b()");
	}

}
