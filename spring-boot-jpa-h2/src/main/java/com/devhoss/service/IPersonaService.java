package com.devhoss.service;

import java.util.List;

import com.devhoss.model.Persona;

public interface IPersonaService {
	public List<Persona> FindAll();
	
	public Persona FindById(long id);

	public Persona Save(Persona persona);
}
