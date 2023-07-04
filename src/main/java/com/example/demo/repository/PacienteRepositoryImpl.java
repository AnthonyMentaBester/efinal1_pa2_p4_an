package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Paciente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PacienteRepositoryImpl implements PacienteRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void ingresar(Paciente paciente) {
        // TODO Auto-generated method stub
        this.entityManager.persist(paciente);
    }

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public Paciente seleccionarPorPaciente(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Paciente paci = this.seleccionarPorPaciente(id);
		this.entityManager.remove(paci);
	}
    
}
