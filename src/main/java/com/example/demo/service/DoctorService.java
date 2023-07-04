package com.example.demo.service;

import com.example.demo.repository.modelo.Doctor;

public interface DoctorService {
    public void agregar(Doctor doctor);
    public void actualizar(Doctor doctor);
    public void borrar(Integer id);
    public Doctor buscarPorDoctor(Integer id);

}
