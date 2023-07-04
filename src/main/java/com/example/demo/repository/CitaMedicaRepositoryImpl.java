package com.example.demo.repository;


import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements CitaMedicaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(CitaMedica citaMedica) {
		this.entityManager.persist(citaMedica);
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public CitaMedica seleccionarPorCitaMedica(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, id);
	}


	

}
