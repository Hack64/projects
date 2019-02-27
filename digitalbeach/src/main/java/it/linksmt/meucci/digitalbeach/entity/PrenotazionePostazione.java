package it.linksmt.meucci.digitalbeach.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="prenotazione_postazione")
public class PrenotazionePostazione implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PrenotazionePostazioneKey key;
	
	@ManyToOne
	@MapsId("UUIDPrenotazione")
	private Prenotazione prenotazione;
	
	@ManyToOne
	@MapsId("UUIDPostazione")
	private Postazione postazione;
	
	private Date DataInizio;
	private Date DataFine;
	
	
	public PrenotazionePostazioneKey getKey() {
		return key;
	}
	public void setKey(PrenotazionePostazioneKey key) {
		this.key = key;
	}
	public Prenotazione getPrenotazione() {
		return prenotazione;
	}
	public void setPrenotazione(Prenotazione prenotazione) {
		this.prenotazione = prenotazione;
	}
	public Postazione getPostazione() {
		return postazione;
	}
	public void setPostazione(Postazione postazione) {
		this.postazione = postazione;
	}
	public Date getDataInizio() {
		return DataInizio;
	}
	public void setDataInizio(Date dataInizio) {
		DataInizio = dataInizio;
	}
	public Date getDataFine() {
		return DataFine;
	}
	public void setDataFine(Date dataFine) {
		DataFine = dataFine;
	}
	
	public PrenotazionePostazione() {
		
	}
	
	public PrenotazionePostazione(PrenotazionePostazioneKey key, Prenotazione prenotazione, Postazione postazione,
			Date dataInizio, Date dataFine) {
		super();
		this.key = key;
		this.prenotazione = prenotazione;
		this.postazione = postazione;
		DataInizio = dataInizio;
		DataFine = dataFine;
	}
	
	
	
	

}
