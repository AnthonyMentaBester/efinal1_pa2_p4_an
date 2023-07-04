package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;


import com.example.demo.repository.modelo.CitaMedica;

public interface CitaMedicaService {
	
	public void agregar(CitaMedica citaMedica);
	public void actualizar(String numCita, String diagnostico,String receta, LocalDate fechaProxCita);
	public CitaMedica buscarPorCitaMedica(Integer id);
	public void agendarCita(String numCita,LocalDate fechaCita,BigDecimal valorCita,String lugarCita,String cedulaDoctor,String cedulaPaciente);
	

}
