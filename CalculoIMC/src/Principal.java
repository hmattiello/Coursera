
public class Principal {

	public static void main(String[] args) {
		Paciente paciente1 = new Paciente(91,1.60);
		paciente1.diagnostico();
		System.out.println("Paciente 1 = "+paciente1.getDiagnostico());
		
		Paciente paciente2 = new Paciente(93,1.81);
		paciente2.diagnostico();
		System.out.println("Paciente 2 = "+paciente2.getDiagnostico());

		Paciente paciente3 = new Paciente(60,1.75);
		paciente3.diagnostico();
		System.out.println("Paciente 3 = "+paciente3.getDiagnostico());	

	}

}
