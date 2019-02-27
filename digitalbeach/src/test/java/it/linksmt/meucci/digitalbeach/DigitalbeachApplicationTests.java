package it.linksmt.meucci.digitalbeach;

import java.util.Date;
import java.util.UUID;

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
}

