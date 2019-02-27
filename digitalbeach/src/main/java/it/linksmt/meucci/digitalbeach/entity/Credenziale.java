package it.linksmt.meucci.digitalbeach.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import it.linksmt.meucci.digitalbeach.converter.ConverterCrittografia;

@Entity
@Table(name="credenziale")
public class Credenziale implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String email;
	@Convert(converter=ConverterCrittografia.class)
	private String password;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="UUIDCliente", nullable=false)
	private Utente utente;
	
	@OneToMany(mappedBy="credenziale", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<Recupero> recuperi;

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public Credenziale(String email, String password, String uUIDCliente) {
		super();
		this.email = email;
		this.password = password;
		
	}
	
	public Credenziale() {
		
	}
	
	
	

}
