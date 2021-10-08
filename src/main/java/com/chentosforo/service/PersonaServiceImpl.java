package com.chentosforo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chentosforo.dao.PersonaDao;
import com.chentosforo.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaDao personaDao;

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return personaDao.findAll();
	}
	
	@Override
	public Optional<Persona> listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return personaDao.findById(id);
	}

	@Override
	public Persona crear(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.save(persona);
	}

	@Override
	public Persona modificar(Persona personaModifica) {
		// TODO Auto-generated method stub
		return personaDao.save(personaModifica);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		personaDao.deleteById(id);

	}

}
