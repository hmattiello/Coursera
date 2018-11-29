package pacote;

public class Referencia {
	
	int modificadorDefault;
	public int modificadorPublico;
	protected int modificadorProtegido;
	private int modificadorPrivado;
	
	public void testeAcesso() {
		modificadorDefault = 0;
		modificadorPublico = 0;
		modificadorProtegido = 0;
		setModificadorPrivado(0);
	}

	public int getModificadorPrivado() {
		return modificadorPrivado;
	}

	public void setModificadorPrivado(int modificadorPrivado) {
		this.modificadorPrivado = modificadorPrivado;
	}

}
