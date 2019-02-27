package it.linksmt.meucci.digitalbeach.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.meucci.digitalbeach.entity.Spiaggia;

@Repository
public interface RepositorySpiaggia extends CrudRepository<Spiaggia, String> {

}
