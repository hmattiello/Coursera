import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculoIMC {

	@Test
	public void testBaixoMuitoGrave() {
		Paciente p1 = new Paciente(50, 1.95);
		p1.diagnostico();
		assertEquals(13.1490,p1.getIMC(),0.01);
	}
	
	@Test
	public void testBaixoGrave() {
		Paciente p2 = new Paciente(60, 1.9);
		p2.diagnostico();
		assertEquals(16.62,p2.getIMC(),0.01);
	}
	
	@Test
	public void testBaixo() {
		Paciente p3 = new Paciente(60, 1.85);
		p3.diagnostico();
		assertEquals(17.53,p3.getIMC(),0.01);
	}
	
	@Test
	public void testNormal() {
		Paciente p4 = new Paciente(70, 1.81);
		p4.diagnostico();
		assertEquals(21.36,p4.getIMC(),0.01);
	}
	
	@Test
	public void testSobrepeso() {
		Paciente p5 = new Paciente(90, 1.81);
		p5.diagnostico();
		assertEquals(27.47,p5.getIMC(),0.01);
	}
	
	@Test
	public void testObesidadeI() {
		Paciente p6 = new Paciente(100, 1.75);
		p6.diagnostico();
		assertEquals(32.65,p6.getIMC(),0.01);
	}
	
	@Test
	public void testObesidadeII() {
		Paciente p7 = new Paciente(120, 1.75);
		p7.diagnostico();
		assertEquals(39.18,p7.getIMC(),0.01);
	}
	
	@Test
	public void testObesidadeIII() {
		Paciente p8 = new Paciente(140, 1.75);
		p8.diagnostico();
		assertEquals(45.71,p8.getIMC(),0.01);
	}

}