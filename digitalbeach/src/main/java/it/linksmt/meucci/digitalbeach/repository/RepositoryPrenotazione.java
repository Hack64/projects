package it.linksmt.meucci.digitalbeach.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.meucci.digitalbeach.entity.Prenotazione;

@Repository
public interface RepositoryPrenotazione extends CrudRepository<Prenotazione, String> {

}
