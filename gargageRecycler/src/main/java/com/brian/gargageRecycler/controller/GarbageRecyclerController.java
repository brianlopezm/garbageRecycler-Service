package com.brian.gargageRecycler.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.brian.gargageRecycler.DTO.TotalRecycling;
import com.brian.gargageRecycler.error.PersonNotFoundException;
import com.brian.gargageRecycler.model.Persona;
import com.brian.gargageRecycler.model.UserRecycling;
import com.brian.gargageRecycler.service.PersonaService;
import com.brian.gargageRecycler.service.UserRecyclingService;



@RestController
public class GarbageRecyclerController {

	@Autowired
	PersonaService ps;
	
	@Autowired
	UserRecyclingService urs;
	
	//Agrega Persona
	@PostMapping(path = "/api/usuarios")
	public ResponseEntity<Persona> registerPersona(@RequestBody Persona p){
		if (ps.findByuserName(p.getUserName())==null) {
			Persona newP = ps.register(p);
			URI location = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(newP.getId())
					.toUri();
			return ResponseEntity.created(location).body(newP);
		}
		throw new PersonNotFoundException("Ya existe el usuario " + p.getUserName() );
	}
	
	//Agrega un reciclado
	@PostMapping(path = "/api/reciclados")
	public ResponseEntity<UserRecycling> addUserrecycling(@RequestBody UserRecycling ur){
		String userName=ur.getUserName();
		if (ps.findByuserName(userName)!=null) {
			UserRecycling newUR=urs.addUserRecycling(ur);
			URI location = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(newUR.getId())
					.toUri();
			return ResponseEntity.created(location).body(newUR);
		}
		throw new PersonNotFoundException("No existe " + userName);
	}
		
	
	//Obtiene todos los reciclados de un Usuario
	@GetMapping(path = "/api/{userName}/reciclados")
	public ResponseEntity<List<UserRecycling>> getAllUserRecyclingByUser(@PathVariable(value = "userName") String userName){
		if (ps.findByuserName(userName)!=null) {
			List <UserRecycling> listByUser=urs.getAllUserRecycling(userName);
			return ResponseEntity.ok(listByUser);
		}
		throw new PersonNotFoundException("No existe " + userName);
	}
	
	//Obtiene el total reciclado
	@GetMapping(path = "/api/{userName}/totalreciclado")
	public TotalRecycling getTotalRecyclingByUser(@PathVariable(value = "userName") String userName){
		if (ps.findByuserName(userName)!=null) {
			TotalRecycling tr= new TotalRecycling(userName,urs.getAllUserRecycling(userName));
			return tr;
		}
		throw new PersonNotFoundException("No existe " + userName);
		
	}

	
	//Obtiene un Usuario
	@GetMapping(path = "/api/usuarios/{userName}")
	public ResponseEntity<Persona> getPersona(@PathVariable(value = "userName") String userName){
		Persona p = ps.findByuserName(userName);
		if (p!=null) {
		return ResponseEntity.ok(p);
		}
		throw new PersonNotFoundException("No existe " + userName);
	}
	
}
