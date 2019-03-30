package com.ch.curso_spring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ch.curso_spring.domain.Category;
import com.ch.curso_spring.repositories.CategoryRepository;

@SpringBootApplication
public class SpringChApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringChApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Informatique");
		Category cat2 = new Category(null, "Bureau");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		
		
		
	}

}
