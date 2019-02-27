package it.linksmt.meucci.digitalbeach;

import java.util.Date;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import it.linksmt.meucci.digitalbeach.entity.Utente;
import it.linksmt.meucci.digitalbeach.repository.RepositoryPostazione;
import it.linksmt.meucci.digitalbeach.repository.RepositoryPrenotazione;
import it.linksmt.meucci.digitalbeach.repository.RepositorySpiaggia;
import it.linksmt.meucci.digitalbeach.repository.RepositoryUtente;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DigitalbeachApplicationTests {

	@Autowired
	private RepositoryPostazione repositoryPostazione;
	
	@Autowired
	private RepositoryPrenotazione repositoryPrenotazione;

	@Autowired
	private RepositorySpiaggia repositorySpiaggia;
	
	@Autowired
	private RepositoryUtente repositoryUtente;
	
	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void insertUser() {
		Utente utente = new Utente();
		@SuppressWarnings("deprecation")
		Date d = new Date(100, 3, 4);
		utente.setCodFiscale("RZZMRC00");
		utente.setCognome("Rizzo");
		utente.setNome("Marco");
		utente.setDataNascita(d);
		utente.setNumeroTelefonico("+393478819527");
		utente.setSesso("Uomo");
		utente.setTipoUtente("Amministratore");
		
		repositoryUtente.save(utente);
		
		System.out.println("Debug");
	}
	
	@Test
	public void getUser() {
		
		Optional<Utente> storedUtente = repositoryUtente.findById("46be2f79-2732-48e3-a2ad-b536e0f3d5e7");
		storedUtente.get().getNome();
		storedUtente.get().getCognome();
	}
}

