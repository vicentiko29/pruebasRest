package com.chentosforo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chentosforo.model.Persona;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Integer> {

}
