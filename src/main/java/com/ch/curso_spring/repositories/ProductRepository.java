package com.ch.curso_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ch.curso_spring.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	

}
