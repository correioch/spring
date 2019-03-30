package com.ch.curso_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ch.curso_spring.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
	

}
