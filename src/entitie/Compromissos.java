package entitie;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Compromissos {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String tipo;
	private Date data;
	private String nomeParticipante;
	private String telefone;
	
	
	public Compromissos() {	
	}

	public Compromissos(String tipo, Date data, String nomeParticipante, String telefone) {
		this.tipo = tipo;
		this.data = data;
		this.nomeParticipante = nomeParticipante;
		this.telefone = telefone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNomeParticipante() {
		return nomeParticipante;
	}

	public void setNomeParticipante(String nomeParticipante) {
		this.nomeParticipante = nomeParticipante;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		return "Tipo: "  
			   + tipo 
			   + "\n Data: " 
			   + sdf.format(data) 
			   + "\n  Participante: "
			   + nomeParticipante 
			   + "\n Telefone: "
			   + telefone;
	}

}
