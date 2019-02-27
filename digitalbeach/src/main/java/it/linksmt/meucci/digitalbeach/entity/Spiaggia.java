package it.linksmt.meucci.digitalbeach.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="spiagge")
public class Spiaggia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String UUIDSpiaggia;
	
	private String Nome;
	private String Descrizione;
	
	@OneToMany(mappedBy="spiaggia", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private List<Postazione> postazioni;
	
	public String getUUIDSpiaggia() {
		return UUIDSpiaggia;
	}
	public void setUUIDSpiaggia(String uUIDSpiaggia) {
		UUIDSpiaggia = uUIDSpiaggia;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDescrizione() {
		return Descrizione;
	}
	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}
	
	public Spiaggia(String uUIDSpiaggia, String nome, String descrizione) {
		super();
		UUIDSpiaggia = uUIDSpiaggia;
		Nome = nome;
		Descrizione = descrizione;
	}
	
	public Spiaggia() {
		
	}
	
	
}
