package com.example.demo.repository;


import com.example.demo.repository.modelo.Paciente;

public interface PacienteRepository {
    public void ingresar(Paciente paciente);
    public void actualizar(Paciente paciente);
    public void eliminar(Integer id);
    public Paciente seleccionarPorPaciente(Integer id);
 
}
