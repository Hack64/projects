package it.linksmt.meucci.digitalbeach.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PrenotazionePostazioneKey implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String UUIDPrenotazione;
	private String UUIDPostazione;
	
	
	public String getUUIDPrenotazione() {
		return UUIDPrenotazione;
	}
	public void setUUIDPrenotazione(String uUIDPrenotazione) {
		UUIDPrenotazione = uUIDPrenotazione;
	}
	public String getUUIDPostazione() {
		return UUIDPostazione;
	}
	public void setUUIDPostazione(String uUIDPostazione) {
		UUIDPostazione = uUIDPostazione;
	}
	
	public PrenotazionePostazioneKey(String uUIDPrenotazione, String uUIDPostazione) {
		super();
		UUIDPrenotazione = uUIDPrenotazione;
		UUIDPostazione = uUIDPostazione;
	}
	
	public PrenotazionePostazioneKey() {
		
	}
	
	
	@Override
	public boolean equals(Object obj) {

		if(obj==null) {
			return false;
		}
		
		if (obj==this) {
			return true;
		}
		
		PrenotazionePostazioneKey receivedKey = (PrenotazionePostazioneKey) obj;
		
		if(UUIDPrenotazione.equals(receivedKey.getUUIDPrenotazione()) && UUIDPostazione.equals(receivedKey.getUUIDPostazione())) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	

	

}
