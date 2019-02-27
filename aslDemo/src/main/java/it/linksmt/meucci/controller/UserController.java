package it.linksmt.meucci.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.linksmt.meucci.entity.User;
import it.linksmt.meucci.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="/users")
	public List<User> findUsers(@RequestParam(name="name", required=false)String name){
		Iterable<User> dbResult = userRepository.findAll();
		if(name==null) {
			dbResult = userRepository.findAll();
		}
		else {
			dbResult = userRepository.findByName(name);
		}
		
		
		List<User> result = new ArrayList<>();
		dbResult.forEach(result::add);
		return result;
	}
	
	@GetMapping(value="/users/{id}")
	public User findById(@PathVariable(name="id", required=true)Integer id){
		Optional<User> result = userRepository.findById(id);
		return result.get();
	}
	
	@PostMapping (value="/users")
	public @ResponseBody Integer saveUser(@RequestBody User user) {
		User savedUser = userRepository.save(user);
		return user.getId();
	}
	
	@PutMapping (value="/users")
	public @ResponseBody Integer updateUser(@RequestBody User user) {
		@SuppressWarnings("unused")
		User savedUser = userRepository.save(user);
		return user.getId();
	}
	
	@DeleteMapping(value="/users/{id}")
	public @ResponseBody Integer deleteUser(@PathVariable(name="id", required=true)Integer id) {
		userRepository.deleteById(id);
		return id;
	}
	
	
	
	
	
}
