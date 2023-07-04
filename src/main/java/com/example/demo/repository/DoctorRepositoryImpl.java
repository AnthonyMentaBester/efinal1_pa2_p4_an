package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class DoctorRepositoryImpl implements DoctorRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Doctor doc = this.seleccionarPorDoctor(id);
		this.entityManager.remove(doc);
	}

	@Override
	public Doctor seleccionarPorDoctor(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, id);
	}

}
