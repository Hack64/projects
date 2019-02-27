package it.linksmt.meucci.aslDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import it.linksmt.meucci.entity.Product;
import it.linksmt.meucci.entity.ProductType;
import it.linksmt.meucci.entity.User;
import it.linksmt.meucci.repository.ProductRepository;
import it.linksmt.meucci.repository.ProductTypeRepository;
import it.linksmt.meucci.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AslDemoApplicationTests {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductTypeRepository productTypeRepository;
	
	
	@Test
	public void contextLoads() {
		User user = new User();
		Product product = new Product();
		ProductType pType = new ProductType();
		
		user.setDateOfBirth(new Date());
		user.setEmail("marco.rizzo@mail.com");
		user.setSurname("Rizzo");
		user.setName("Marco");
		user.setSsn("RZZMRC00");
	
		User savedUser = userRepository.save(user);
		//Optional<User> result=userRepository.findById(1);
		//Optional<User> result2=userRepository.findById(5);
		Optional <User> storedUser = userRepository.findById(savedUser.getId());
		
		assertNotNull(storedUser.get());
		//assertEquals(savedUser.getDateOfBirth(), storedUser.get().getDateOfBirth());
		assertEquals(savedUser.getEmail(), storedUser.get().getEmail());
		assertEquals(savedUser.getId(), storedUser.get().getId());
		assertEquals(savedUser.getName(), storedUser.get().getName());
		
		userRepository.deleteById(savedUser.getId());
		
		//product.set
		
		System.out.println("Done");
	}
	
	@Test
	public void readProduct() {
		Optional<Product> product = productRepository.findById(1);
		
		System.out.println("Blocking, debug....");
	}
	
	@Test
	public void readUser() {
		Optional<User> user = userRepository.findById(1);
		System.out.println("break");
	}
	
	@Test
	public void readProductType() {
		Optional<ProductType> productType = productTypeRepository.findById(1);
		
		System.out.println("Blocking, debug....");
	}
	
	@Test
	public void insertUser() {
		User user = new User();
		
		user.setDateOfBirth(new Date());
		user.setEmail("marco.rizzo@mail.com");
		user.setSurname("Verdi");
		user.setName("Giuseppe");
		user.setSsn("VRDGSP00");
	
		User savedUser = userRepository.save(user);
	}
	
	@Test
	public void insertProduct() {
		Product product = new Product();
		ProductType productType = new ProductType();
		
		productType.setId(1);
		product.setName("Riso venere");
		product.setDescription("Riso venere alta qualita doc");
		product.setPrice(Float.parseFloat("2.0"));
		product.setBarCode("800321234");
		product.setProductType(productType);
		
		productRepository.save(product);
	}
	
	@Test
	public void insertProductType() {
		ProductType productType = new ProductType();
		
		productType.setName("Pasta");
		productType.setDescription("Pasta di alta qualità");
		
		productTypeRepository.save(productType);
	}

}
