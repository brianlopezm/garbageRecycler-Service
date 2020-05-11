package com.brian.gargageRecycler.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.brian.gargageRecycler.model.Persona;

@RepositoryRestResource(exported = false)
public interface PersonaRepository extends PagingAndSortingRepository<Persona, Long>{
	Persona findByuserName(String name);
	
	List <Persona> findBy();
}
