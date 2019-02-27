package it.linksmt.meucci.digitalbeach.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="postazione")
public class Postazione implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String UUIDPostazione;
	private boolean Occupato;
	private Integer Colonna;
	private Integer Fila;
	private double Prezzo;
	private double ScontoSettimanale;
	private double ScontoMensile;
	private double ScontoPersonalizzato;
	
	@ManyToOne
	@JoinColumn(name="UUIDSpiaggia", nullable=false)
	private Spiaggia spiaggia;
	
	@OneToMany(mappedBy="postazione", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private List<PrenotazionePostazione> prenotazioniPostazioni;
	
	
	public String getUUIDPostazione() {
		return UUIDPostazione;
	}
	public void setUUIDPostazione(String uUIDPostazione) {
		UUIDPostazione = uUIDPostazione;
	}
	public boolean isOccupato() {
		return Occupato;
	}
	public void setOccupato(boolean occupato) {
		Occupato = occupato;
	}
	public Integer getColonna() {
		return Colonna;
	}
	public void setColonna(Integer colonna) {
		Colonna = colonna;
	}
	public Integer getFila() {
		return Fila;
	}
	public void setFila(Integer fila) {
		Fila = fila;
	}
	public double getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(double prezzo) {
		Prezzo = prezzo;
	}
	public double getScontoSettimanale() {
		return ScontoSettimanale;
	}
	public void setScontoSettimanale(double scontoSettimanale) {
		ScontoSettimanale = scontoSettimanale;
	}
	public double getScontoMensile() {
		return ScontoMensile;
	}
	public void setScontoMensile(double scontoMensile) {
		ScontoMensile = scontoMensile;
	}
	public double getScontoPersonalizzato() {
		return ScontoPersonalizzato;
	}
	public void setScontoPersonalizzato(double scontoPersonalizzato) {
		ScontoPersonalizzato = scontoPersonalizzato;
	}
	
	public Postazione() {
		
	}
	
	public Postazione(String uUIDPostazione, boolean occupato, Integer colonna, Integer fila, double prezzo,
			double scontoSettimanale, double scontoMensile, double scontoPersonalizzato) {
		super();
		UUIDPostazione = uUIDPostazione;
		Occupato = occupato;
		Colonna = colonna;
		Fila = fila;
		Prezzo = prezzo;
		ScontoSettimanale = scontoSettimanale;
		ScontoMensile = scontoMensile;
		ScontoPersonalizzato = scontoPersonalizzato;
	}
	
	
	
	

}
