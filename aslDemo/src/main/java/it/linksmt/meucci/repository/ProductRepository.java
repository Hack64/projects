package it.linksmt.meucci.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.meucci.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
