
public class Principal {

	public static void main(String[] args) {
		
		Aluno mattiello = new Aluno();
		mattiello.bim1 = 70;
		mattiello.bim2 = 70;
		mattiello.bim3 = 60;
		mattiello.bim4 = 80;
					
		System.out.println(mattiello.media());
		System.out.println(mattiello.passouDeAno());
	}

}
