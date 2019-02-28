package it.linksmt.meucci.digitalbeach;

import java.util.Date;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import it.linksmt.meucci.digitalbeach.entity.Credenziale;
import it.linksmt.meucci.digitalbeach.entity.Utente;
import it.linksmt.meucci.digitalbeach.repository.RepositoryCredenziale;
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
	
	@Autowired
	private RepositoryCredenziale repositoryCredenziale;
	
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
	public void insertUserAndCredentials() {
		Utente utente = new Utente();
		Credenziale credenziale = new Credenziale();
		Date d = new Date(100, 3, 4);
		utente.setCodFiscale("RZZMRC00");
		utente.setCognome("Rizzo");
		utente.setNome("Marco");
		utente.setDataNascita(d);
		utente.setNumeroTelefonico("+393478819527");
		utente.setSesso("Uomo");
		utente.setTipoUtente("Amministratore");
		credenziale.setEmail("marco@rizzo.com");
		credenziale.setPassword("hello");
		repositoryUtente.save(utente);
		repositoryCredenziale.save(credenziale);
		
	}
	@Test
	public void getUser() {
		
		Optional<Utente> storedUtente = repositoryUtente.findById("7f7d266e-d9cf-49df-8b7e-450bf9826ba0");
		System.out.println(storedUtente.get().getNome());
		System.out.println(storedUtente.get().getCognome());
	}
	
	@Test
	public void deleteUser() {
		repositoryUtente.deleteById("");
	}
}

