package it.linksmt.meucci.digitalbeach.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.meucci.digitalbeach.entity.Credenziale;

@Repository
public interface RepositoryCredenziale extends CrudRepository<Credenziale, String> {

}
