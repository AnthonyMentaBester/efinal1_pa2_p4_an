package com.example.demo.service;

import com.example.demo.repository.modelo.Paciente;

public interface PacienteService {
	public void agregar(Paciente paciente);
    public void actualizar(Paciente paciente);
    public void borrar(Integer id);
    public Paciente buscarPorPaciente(Integer id);

}
