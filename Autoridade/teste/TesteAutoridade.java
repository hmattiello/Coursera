import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutoridade {

	@Test
	public void testeInformal() {
		Autoridade autoridade = new Autoridade(new Informal("Henrique"));
		assertEquals("Henrique",autoridade.getTratamento());
	}
	
	@Test
	public void testeComTitulo() {
		Autoridade autoridade = new Autoridade(new ComTitulo("Henrique","Mattiello","Aprendiz"));
		assertEquals("Aprendiz Henrique Mattiello",autoridade.getTratamento());
	}
	
	@Test
	public void testeRespeitosoMasculino() {
		Autoridade autoridade = new Autoridade(new Respeitoso("Mattiello",true));
		assertEquals("Sr. Mattiello",autoridade.getTratamento());
	}
	
	@Test
	public void testeRespeitosoFeminino() {
		Autoridade autoridade = new Autoridade(new Respeitoso("Mattiello",false));
		assertEquals("Sra. Mattiello",autoridade.getTratamento());
	}


}
