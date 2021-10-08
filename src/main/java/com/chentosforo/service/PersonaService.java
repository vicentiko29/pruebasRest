package com.chentosforo.service;

import java.util.List;
import java.util.Optional;

import com.chentosforo.model.Persona;

public interface PersonaService {

	List<Persona> listar();
	
	Optional<Persona> listarPorId(Integer id);

	Persona crear(Persona persona);

	Persona modificar(Persona personaModifica);

	void eliminar(Integer id);

}
