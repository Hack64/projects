package it.linksmt.meucci.aslDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages= {"it.linksmt.meucci.controller"})
@EnableJpaRepositories(basePackages= {"it.linksmt.meucci.repository"})
@EntityScan(basePackages= {"it.linksmt.meucci.entity"})
@SpringBootApplication
public class AslDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AslDemoApplication.class, args);
	}

}
