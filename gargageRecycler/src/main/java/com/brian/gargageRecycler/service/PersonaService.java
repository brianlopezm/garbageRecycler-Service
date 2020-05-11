package com.brian.gargageRecycler.service;

import java.util.List;

import com.brian.gargageRecycler.model.Persona;

public interface PersonaService {
	Persona register(Persona p);

	Persona findByuserName(String userName);
	
	List<Persona> getAllPersonas();
}
