import java.util.Date;

public class Pessoa {
	
	private Date dataNascimento;
	
	@SuppressWarnings("deprecation")
	public int getIdade() {
		int idade;
		Date dataAtual = new Date();
		
		idade = dataAtual.getYear() - dataNascimento.getYear();	
		
		if  (dataAtual.getMonth() < dataNascimento.getMonth()){
			idade--;
		}
		else if ((dataAtual.getMonth()==dataNascimento.getMonth()) && (dataAtual.getDate() < dataNascimento.getDate())){
			idade--;
		}
		return idade;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@SuppressWarnings("deprecation")
	public String getSigno() {
		String signo = null;
		if ((dataNascimento.getMonth()==11 && dataNascimento.getDate()>=22) || (dataNascimento.getMonth()==0 && dataNascimento.getDate()<=20)){
			signo = "Capric�rnio"; 
		}		
		else if ((dataNascimento.getMonth()==0 && dataNascimento.getDate()>=21) || (dataNascimento.getMonth()==1 && dataNascimento.getDate()<=19)){
			signo = "Aqu�rio"; 
		}
		
		else if ((dataNascimento.getMonth()==1 && dataNascimento.getDate()>=20) || (dataNascimento.getMonth()==2 && dataNascimento.getDate()<=20)){
			signo = "Peixes"; 
		}		
		else if ((dataNascimento.getMonth()==2 && dataNascimento.getDate()>=21) || (dataNascimento.getMonth()==3 && dataNascimento.getDate()<=20)){
			signo = "�ries"; 
		}
		else if ((dataNascimento.getMonth()==3 && dataNascimento.getDate()>=21) || (dataNascimento.getMonth()==4 && dataNascimento.getDate()<=20)){
			signo = "Touro"; 
		}		
		else if ((dataNascimento.getMonth()==4 && dataNascimento.getDate()>=21) || (dataNascimento.getMonth()==5 && dataNascimento.getDate()<=20)){
			signo = "G�meos"; 
		}		
		else if ((dataNascimento.getMonth()==5 && dataNascimento.getDate()>=21) || (dataNascimento.getMonth()==6 && dataNascimento.getDate()<=21)){
			signo = "C�ncer"; 
		}		
		else if ((dataNascimento.getMonth()==6 && dataNascimento.getDate()>=22) || (dataNascimento.getMonth()==7 && dataNascimento.getDate()<=22)){
			signo = "Le�o"; 
		}
		else if ((dataNascimento.getMonth()==7 && dataNascimento.getDate()>=23) || (dataNascimento.getMonth()==8 && dataNascimento.getDate()<=22)){
			signo = "Virgem"; 
		}		
		else if ((dataNascimento.getMonth()==8 && dataNascimento.getDate()>=23) || (dataNascimento.getMonth()==9 && dataNascimento.getDate()<=22)){
			signo = "Libra"; 
		}		
		else if ((dataNascimento.getMonth()==9 && dataNascimento.getDate()>=23) || (dataNascimento.getMonth()==10 && dataNascimento.getDate()<=21)){
			signo = "Escorpi�o"; 
		}		
		else if ((dataNascimento.getMonth()==10 && dataNascimento.getDate()>=22) || (dataNascimento.getMonth()==11 && dataNascimento.getDate()<=21)){
			signo = "Sagit�rio"; 
		}		
		return signo;		 
	}

}
