package com.curso.model.service;

import java.util.ArrayList;
import java.util.List;

import com.curso.model.entity.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
	
	public PersonaService() {
		super();
		persona.add(new Persona(1l, "Sayurith"));
		persona.add(new Persona(2l, "Yevinson"));
		persona.add(new Persona(3l, "Yonaikel"));
		persona.add(new Persona(4l, "Yowilson"));
		persona.add(new Persona(5l, "Sayurith"));
		persona.add(new Persona(6l, "Yevinson"));
		persona.add(new Persona(7l, "Yonaikel"));
		persona.add(new Persona(8l, "Yowilson"));
		persona.add(new Persona(9l, "Sayurith"));
		persona.add(new Persona(10l, "Yevinson"));
		persona.add(new Persona(11l, "Yonaikel"));
		persona.add(new Persona(12l, "Yowilson"));
		persona.add(new Persona(13l, "Sayurith"));
		persona.add(new Persona(14l, "Yevinson"));
		persona.add(new Persona(15l, "Yonaikel"));
		persona.add(new Persona(16l, "Yowilson"));
		persona.add(new Persona(17l, "Sayurith"));
		persona.add(new Persona(18l, "Yevinson"));
		persona.add(new Persona(19l, "Yonaikel"));
		persona.add(new Persona(20l, "Yowilson"));
		persona.add(new Persona(21l, "Sayurith"));
		persona.add(new Persona(22l, "Yevinson"));
		persona.add(new Persona(23l, "Yonaikel"));
		persona.add(new Persona(24l, "Yowilson"));
		persona.add(new Persona(25l, "Sayurith"));
		persona.add(new Persona(26l, "Yevinson"));
		persona.add(new Persona(27l, "Yonaikel"));
		persona.add(new Persona(28l, "Yowilson"));
		persona.add(new Persona(29l, "Sayurith"));
		persona.add(new Persona(30l, "Yevinson"));
		persona.add(new Persona(31l, "Yonaikel"));
		persona.add(new Persona(32l, "Yowilson"));
		persona.add(new Persona(33l, "Sayurith"));
		persona.add(new Persona(34l, "Yevinson"));
		persona.add(new Persona(35l, "Yonaikel"));
		persona.add(new Persona(36l, "Yowilson"));
	}

	List<Persona> persona = new ArrayList<Persona>();
	
	@Override
	public List<Persona> findAll() {
		
		return persona;
	}

	@Override
	public List<Persona> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona addPersona(String name) {
		Persona personaSingle = new Persona();
		personaSingle.setName(name);
		personaSingle.setId(persona.size()+1L);
		persona.add(personaSingle);
		return personaSingle;
	}
	
}
