package it.linksmt.meucci.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.meucci.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	List<User> findByName(String name);
}
