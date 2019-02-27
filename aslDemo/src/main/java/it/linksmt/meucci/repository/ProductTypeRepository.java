package it.linksmt.meucci.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.meucci.entity.ProductType;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, Integer> {

}
