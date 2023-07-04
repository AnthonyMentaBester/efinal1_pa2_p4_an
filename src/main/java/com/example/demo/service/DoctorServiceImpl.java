package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public void agregar(Doctor doctor) {
        // TODO Auto-generated method stub
        this.doctorRepository.ingresar(doctor);
    }

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.actualizar(doctor);
	}

	@Override
	public Doctor buscarPorDoctor(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepository.seleccionarPorDoctor(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepository.eliminar(id);
	}
    
}