package it.linksmt.meucci.digitalbeach.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.meucci.digitalbeach.entity.Utente;

@Repository
public interface RepositoryUtente extends CrudRepository<Utente, String>{

}
