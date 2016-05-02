package com.curso.model.service;

import java.util.ArrayList;
import java.util.List;

import com.curso.model.entity.Persona;
import com.curso.model.repository.IPersonaRepository;
import com.google.common.collect.Lists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
	
	@Autowired
	private IPersonaRepository personaRepository;
	
	public PersonaService() {
		super();
	}
	
	@Override
	public List<Persona> findAll() {
		List<Persona> personas = new ArrayList<Persona>();
		personas = Lists.newArrayList(personaRepository.findAll());
		return personas;
	}

	@Override
	public List<Persona> search(String keyword) {
		List<Persona> personas = new ArrayList<Persona>();
		personas = Lists.newArrayList(personaRepository.findByNameLike("%" + keyword + "%"));
		return personas;
	}

	@Override
	public Persona addPersona(String name) {
//		Persona personaSingle = new Persona();
//		personaSingle.setName(name);
//		personaSingle.setId(persona.size()+1L);
//		persona.add(personaSingle);
//		return personaSingle;
		return null;
	}
	
}
