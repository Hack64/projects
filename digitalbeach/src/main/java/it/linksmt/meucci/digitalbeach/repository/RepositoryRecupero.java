package it.linksmt.meucci.digitalbeach.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.meucci.digitalbeach.entity.Recupero;

@Repository
public interface RepositoryRecupero extends CrudRepository<Recupero, String> {

}
