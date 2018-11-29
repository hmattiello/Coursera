
public class Paciente {
	
	private double peso;
	private double altura;
	private double indiceIMC = 0;
	private String diagnostico;
	
	public Paciente(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	
	private void calcularIMC (double peso, double altura){
		indiceIMC = (peso / (altura*altura));
	}
	
	public double getIMC() {
		return indiceIMC;
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}
	
	public void diagnostico() {
		calcularIMC(peso,altura);
		if (indiceIMC < 16) {
			diagnostico = "Baixo peso muito grave: IMC = "+getIMC();
		}
		if (indiceIMC >= 16 && indiceIMC < 16.99) {
			diagnostico = "Baixo peso grave: IMC = "+getIMC();
		}
		if (indiceIMC >= 17 && indiceIMC < 18.49) {
			diagnostico = "Baixo peso: IMC = "+getIMC();
		}
		if (indiceIMC >= 18.50 && indiceIMC < 24.99) {
			diagnostico = "Peso normal: IMC = "+getIMC();
		}
		
		if (indiceIMC >= 25 && indiceIMC < 29.99) {
			diagnostico = "Sobrepeso: IMC = "+getIMC();
		}
		if (indiceIMC >= 30 && indiceIMC < 34.99) {
			diagnostico = "Obesidade grau I: IMC = "+getIMC();
		}
		if (indiceIMC >= 35 && indiceIMC < 39.99) {
			diagnostico = "Obesidade grau II: IMC = "+getIMC();
		}
		if (indiceIMC >40) {
			diagnostico = "Obesidade grau III: IMC = "+getIMC();
		}
	}	

}
