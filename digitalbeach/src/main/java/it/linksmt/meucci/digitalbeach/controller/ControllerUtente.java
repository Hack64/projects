package it.linksmt.meucci.digitalbeach.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.linksmt.meucci.digitalbeach.entity.Utente;
import it.linksmt.meucci.digitalbeach.repository.RepositoryUtente;

@RestController
public class ControllerUtente {
	
	@Autowired
	private RepositoryUtente repositoryUtente;
	
	@GetMapping(value="/utenti")
	public List<Utente> getUsers(){
		Iterable<Utente> dbResult = repositoryUtente.findAll();
		dbResult = repositoryUtente.findAll();
		List<Utente> result = new ArrayList<>();
		dbResult.forEach(result::add);
		return result;
	}
	
	@PutMapping (value="/utenti")
	public @ResponseBody String updateUser(@RequestBody Utente utente) {
		@SuppressWarnings("unused")
		Utente savedUser = repositoryUtente.save(utente);
		return utente.getUUIDCliente();
	}

}
