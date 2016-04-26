package com.curso.model.service;

import java.util.List;

import com.curso.model.entity.Persona;

public interface IPersonaService {

	public List<Persona> findAll();
	public List<Persona> search (String keyword);
	public Persona addPersona(String name);
}
