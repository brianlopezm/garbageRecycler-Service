package com.brian.gargageRecycler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brian.gargageRecycler.model.Persona;
import com.brian.gargageRecycler.repository.PersonaRepository;

@Service
public class PersonaServiceImp implements PersonaService {

	@Autowired
	PersonaRepository pr;
	
	@Override
	public Persona register(Persona p) {
		return pr.save(p);
	}

	@Override
	public Persona findByuserName(String userName) {
		return pr.findByuserName(userName);
	}

	@Override
	public List<Persona> getAllPersonas() {
		return pr.findBy();
	}

}
