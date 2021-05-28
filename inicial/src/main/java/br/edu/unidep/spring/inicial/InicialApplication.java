package br.edu.unidep.spring.inicial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class InicialApplication {

	public static void main(String[] args) {
		SpringApplication.run(InicialApplication.class, args);
	}

}
