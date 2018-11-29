import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroPontos {

	@Test
	public void pontosCriarTopico() {
		Usuario u = new Usuario ();
		u.nome="Mattiello";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 5);
	}

	@Test
	public void pontosCriarTopicoVIP() {
		Usuario u = new Usuario ();
		u.nome="Mattiello";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 25);
	}
	
	@Test
	public void pontosCriarTopicoBonusDia() {
		Usuario u = new Usuario ();
		u.nome="Mattiello";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 15);
	}
	
	@Test
	public void pontosCriarTopicoBonusDiaVIP() {
		Usuario u = new Usuario ();
		u.nome="Mattiello";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 50);
	}
	
}
