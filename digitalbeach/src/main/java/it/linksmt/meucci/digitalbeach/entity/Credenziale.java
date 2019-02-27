package it.linksmt.meucci.digitalbeach.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="credenziale")
public class Credenziale implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String email;
	private String password;
	
	@OneToOne(fetch=FetchType.EAGER)
	@MapsId
	private Utente utente;
	
	@OneToMany(mappedBy="recupero", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
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
