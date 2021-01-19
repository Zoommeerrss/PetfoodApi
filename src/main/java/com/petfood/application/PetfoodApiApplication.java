package com.petfood.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.petfood.*")
@EnableAutoConfiguration
@EntityScan(basePackages = { "com.petfood.entity"}) 
@EnableJpaRepositories(basePackages = { "com.petfood.dao" })
public class PetfoodApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetfoodApiApplication.class, args);
	}
}
