package it.linksmt.meucci.digitalbeach.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import it.linksmt.meucci.digitalbeach.converter.ConverterCrittografia;

@Entity
@Table(name="utente")
public class Utente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(
				name="UUID",
				strategy="org.hibernate.id.UUIDGenerator"
			)
	private String UUIDCliente;
	
	private String Nome;
	
	@Convert(converter=ConverterCrittografia.class)
	private String Cognome;
	private String CodFiscale;
	private String TipoUtente;
	private String Sesso;
	private Date DataNascita;
	private String NumeroTelefonico;
	
	@OneToMany(mappedBy="utente", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private List<Prenotazione> prenotazioni;
	
	
	
	public String getUUIDCliente() {
		return UUIDCliente;
	}
	public void setUUIDCliente(String uUIDCliente) {
		UUIDCliente = uUIDCliente;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	public String getCodFiscale() {
		return CodFiscale;
	}
	public void setCodFiscale(String codFiscale) {
		CodFiscale = codFiscale;
	}
	public String getTipoUtente() {
		return TipoUtente;
	}
	public void setTipoUtente(String tipoUtente) {
		TipoUtente = tipoUtente;
	}
	public String getSesso() {
		return Sesso;
	}
	public void setSesso(String sesso) {
		Sesso = sesso;
	}
	public Date getDataNascita() {
		return DataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		DataNascita = dataNascita;
	}
	public String getNumeroTelefonico() {
		return NumeroTelefonico;
	}
	public void setNumeroTelefonico(String numeroTelefonico) {
		NumeroTelefonico = numeroTelefonico;
	}
	public Utente() {
		
	}
	
	public Utente(String uUIDCliente, String nome, String cognome, String codFiscale, String tipoUtente, String sesso,
			Date dataNascita, String numeroTelefonico) {
		super();
		UUIDCliente = uUIDCliente;
		Nome = nome;
		Cognome = cognome;
		CodFiscale = codFiscale;
		TipoUtente = tipoUtente;
		Sesso = sesso;
		DataNascita = dataNascita;
		NumeroTelefonico = numeroTelefonico;
	}
	
	
	
	
	
	

}
