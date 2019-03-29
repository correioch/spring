package com.ch.curso_spring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ch.curso_spring.domain.Category;

@RestController
@RequestMapping(value="categories")
public class CategoryResource {
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Category> list() {
		Category cat1 = new Category(1, "infomatique");
		Category cat2 = new Category(2, "bureau");
		
		List<Category> listCategory = new ArrayList<>();
		listCategory.add(cat1);
		listCategory.add(cat2);
		
		return listCategory;
	}

}
