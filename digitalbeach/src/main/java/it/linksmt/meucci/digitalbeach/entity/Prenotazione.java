package it.linksmt.meucci.digitalbeach.entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name="prenotazione")
public class Prenotazione implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String UUIDPrenotazione;
	private double importo;
	private Integer giorni;
	private String MetodoPagamento;
	private Date DataPrenotazione;
	
	@ManyToOne
	@JoinColumn(name="UUIDCliente", nullable=false)
	private Utente utente;
	
	@OneToMany(mappedBy="prenotazione", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private List<PrenotazionePostazione> prenotazioniPostazioni;
	
	public String getUUIDPrenotazione() {
		return UUIDPrenotazione;
	}
	public void setUUIDPrenotazione(String uUIDPrenotazione) {
		UUIDPrenotazione = uUIDPrenotazione;
	}
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	public Integer getGiorni() {
		return giorni;
	}
	public void setGiorni(Integer giorni) {
		this.giorni = giorni;
	}
	public String getMetodoPagamento() {
		return MetodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		MetodoPagamento = metodoPagamento;
	}
	public Date getDataPrenotazione() {
		return DataPrenotazione;
	}
	public void setDataPrenotazione(Date dataPrenotazione) {
		DataPrenotazione = dataPrenotazione;
	}
	
	public Prenotazione(String uUIDPrenotazione, double importo, Integer giorni, String metodoPagamento,
			Date dataPrenotazione) {
		super();
		UUIDPrenotazione = uUIDPrenotazione;
		this.importo = importo;
		this.giorni = giorni;
		MetodoPagamento = metodoPagamento;
		DataPrenotazione = dataPrenotazione;
	}
	
	public Prenotazione() {
		
	}
	
	
	

}
