package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PacienteRepository;
import com.example.demo.repository.modelo.Paciente;
@Service
public class PacienteServiceImpl implements PacienteService{

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public void agregar(Paciente paciente) {
        // TODO Auto-generated method stub
        this.pacienteRepository.ingresar(paciente);
        
    }

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.actualizar(paciente);
		
	}

	@Override
	public Paciente buscarPorPaciente(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.seleccionarPorPaciente(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepository.eliminar(id);
	}
    
}