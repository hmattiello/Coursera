import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class TestePessoa {
	
	Pessoa henrique;
	Pessoa fernanda;
	Pessoa jorge;
	
	Relogio relogio;

	@Before
	public void inicializaPessoas() {
		henrique = new Pessoa();
		fernanda = new Pessoa();
		jorge = new Pessoa();		
	}
	
	@Test
	public void testeAquario() {
		
		Date dataNascimento = new Date();		
		dataNascimento.setYear(82);
		dataNascimento.setMonth(1);
		dataNascimento.setDate(8);		
		henrique.setDataNascimento(dataNascimento);
		assertEquals("Aquário",henrique.getSigno());
	}
	
	@Test
	public void testeLibra() {
		
		Date dataNascimento = new Date();		
		dataNascimento.setYear(82);
		dataNascimento.setMonth(9);
		dataNascimento.setDate(7);		
		fernanda.setDataNascimento(dataNascimento);
		assertEquals("Libra",fernanda.getSigno());
	}
	
	@Test
	public void testeLeao() {
		
		Date dataNascimento = new Date();		
		dataNascimento.setYear(51);
		dataNascimento.setMonth(7);
		dataNascimento.setDate(14);		
		jorge.setDataNascimento(dataNascimento);
		assertEquals("Leão",jorge.getSigno());
	}
	
	@Test
	public void testeIdadeHenrique() {
		Date dataNascimento = new Date();		
		dataNascimento.setYear(82);
		dataNascimento.setMonth(10);
		dataNascimento.setDate(27);		
		henrique.setDataNascimento(dataNascimento);
		assertEquals(36,henrique.getIdade());
		
		System.out.println(System.currentTimeMillis());
		
	}	
}