package com.example.demo.repository;



import com.example.demo.repository.modelo.CitaMedica;


public interface CitaMedicaRepository {
	public void ingresar(CitaMedica citaMedica);
	public void actualizar(CitaMedica citaMedica);
	public CitaMedica seleccionarPorCitaMedica(Integer id);
	
}
