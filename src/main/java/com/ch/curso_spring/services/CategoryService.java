package com.ch.curso_spring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch.curso_spring.domain.Category;
import com.ch.curso_spring.repositories.CategoryRepository;
import com.ch.curso_spring.services.exception.ObjectNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	public Category find(Integer id) {
		
		Optional<Category> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found!  Id: " + id
			+ ", Type: " + Category.class.getName()));
		
	}

}
