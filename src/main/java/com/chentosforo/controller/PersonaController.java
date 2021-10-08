package com.chentosforo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chentosforo.model.Persona;
import com.chentosforo.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	@GetMapping
	public List<Persona> listar() {
		return personaService.listar();
	}
	
	@GetMapping(value="{id}")
	public Optional<Persona> listarPorId(@PathVariable("id") Integer id) {
		return personaService.listarPorId(id);
	}
	
	@PostMapping(consumes="application/json")
	public Persona registrar(@RequestBody Persona persona) {
		return personaService.crear(persona);
	}
	
	@PutMapping(consumes="application/json")
	public Persona modificar(@RequestBody Persona persona) {
		return personaService.crear(persona);
	}

	@DeleteMapping(value="{id}")
	public void eliminar(@PathVariable ("id") Integer id) {
		 personaService.eliminar(id);
	}
}
