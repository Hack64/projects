package it.linksmt.meucci.digitalbeach.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="recupero")
public class Recupero implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String IDRecupero;
	private String domanda;
	private String risposta;
	
	@ManyToOne
	@JoinColumn(name="email", nullable=false)
	private Credenziale credenziale;
	
	public String getIDRecupero() {
		return IDRecupero;
	}
	public void setIDRecupero(String iDRecupero) {
		IDRecupero = iDRecupero;
	}
	public String getDomanda() {
		return domanda;
	}
	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}
	public String getRisposta() {
		return risposta;
	}
	public void setRisposta(String risposta) {
		this.risposta = risposta;
	}
	
	public Recupero() {
		
	}
	
	public Recupero(String iDRecupero, String domanda, String risposta) {
		super();
		IDRecupero = iDRecupero;
		this.domanda = domanda;
		this.risposta = risposta;
	}
	
	

}
