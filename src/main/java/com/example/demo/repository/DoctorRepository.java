package com.example.demo.repository;

import com.example.demo.repository.modelo.Doctor;

public interface DoctorRepository {
    public void ingresar(Doctor doctor);
    public void actualizar(Doctor doctor);
    public void eliminar(Integer id);
    public Doctor seleccionarPorDoctor(Integer id);
    
}

