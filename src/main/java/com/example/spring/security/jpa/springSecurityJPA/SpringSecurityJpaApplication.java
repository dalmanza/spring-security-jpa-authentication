package com.example.spring.security.jpa.springSecurityJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityJpaApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SpringSecurityJpaApplication.class, args);
	}

}
