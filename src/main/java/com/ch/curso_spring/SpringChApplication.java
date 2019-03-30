package com.ch.curso_spring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ch.curso_spring.domain.Category;
import com.ch.curso_spring.domain.City;
import com.ch.curso_spring.domain.Product;
import com.ch.curso_spring.domain.State;
import com.ch.curso_spring.repositories.CategoryRepository;
import com.ch.curso_spring.repositories.CityRepository;
import com.ch.curso_spring.repositories.ProductRepository;
import com.ch.curso_spring.repositories.StateRepository;

@SpringBootApplication
public class SpringChApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private StateRepository stateRepository;
	@Autowired
	private CityRepository cityRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringChApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Informatique");
		Category cat2 = new Category(null, "Bureau");
		
		Product p1 = new Product(null, "Ordinateur", 2000.00 );
		Product p2 = new Product(null, "Printer", 800.00 );
		Product p3 = new Product(null, "Souari", 80.00 );
		
		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProducts().addAll(Arrays.asList(p2));
		
		p1.getCategories().addAll(Arrays.asList(cat1));
		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
		p3.getCategories().addAll(Arrays.asList(cat1));
		
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		State state1 = new State(null, "Ontario");
		State state2 = new State(null, "Quebec");
		
		City city1 = new City(null, "Montreal", state2);
		City city2 = new City(null, "Toronto", state1);
		City city3 = new City(null, "Quebec", state2);
		
		state1.getCities().addAll(Arrays.asList(city2));
		state2.getCities().addAll(Arrays.asList(city1, city3));

		stateRepository.saveAll(Arrays.asList(state1, state2));
		cityRepository.saveAll(Arrays.asList(city1, city2, city3));
		
	}

}
