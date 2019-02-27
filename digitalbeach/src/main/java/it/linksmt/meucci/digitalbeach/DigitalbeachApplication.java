package it.linksmt.meucci.digitalbeach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages= {"it.linksmt.meucci.digitalbeach.controller"})
@EnableJpaRepositories(basePackages= {"it.linksmt.meucci.digitalbeach.repository"})
@EntityScan(basePackages= {"it.linksmt.meucci.digitalbeach.entity"})
@SpringBootApplication
public class DigitalbeachApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalbeachApplication.class, args);
	}

}
