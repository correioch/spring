package com.ch.curso_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ch.curso_spring.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	

}
