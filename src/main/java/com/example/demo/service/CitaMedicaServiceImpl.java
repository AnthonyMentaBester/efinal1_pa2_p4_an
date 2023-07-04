package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CitaMedicaRepository;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PacienteRepository;
import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

@Service
public class CitaMedicaServiceImpl implements CitaMedicaService{
	
	@Autowired
	private CitaMedicaRepository citaMedicaRepository;
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private PacienteRepository pacienteRepository;

	@Override
	public void agregar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.ingresar(citaMedica);
	}

	@Override
	public void actualizar(String numCita,String diagnostico,String receta, LocalDate fechaProxCita) {
		// TODO Auto-generated method stub
		CitaMedica citOrigen = this.citaMedicaRepository.seleccionarPorCitaMedica(3);
		citOrigen.setDiagnostico(diagnostico);
		citOrigen.setReceta(receta);
		citOrigen.setFechaProxCita(fechaProxCita);
		this.citaMedicaRepository.actualizar(citOrigen);
	}

	@Override
	public CitaMedica buscarPorCitaMedica(Integer id) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.seleccionarPorCitaMedica(id);
	}

	@Override
	public void agendarCita(String numCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
						
				Doctor docOrigen = this.doctorRepository.seleccionarPorDoctor(3);
				Paciente pacienteOrigen = this.pacienteRepository.seleccionarPorPaciente(3);

				
				String cedulaOrigenD = docOrigen.getCedula();
				String cedulaOrigenP = pacienteOrigen.getCedula();
				
				if(cedulaOrigenD.equals(cedulaDoctor) && cedulaOrigenP.equals(cedulaPaciente)) {
					CitaMedica cit = new CitaMedica();
				    cit.setNumCita(numCita);
				    cit.setFechaCita(fechaCita);
				    cit.setValorCita(valorCita);
				    cit.setLugarCita(lugarCita);
				    cit.setDoctor(docOrigen);
				    cit.setPaciente(pacienteOrigen);
				    this.citaMedicaRepository.ingresar(cit);
				    
					
				}
				else {
					System.out.println("La cedula del doctor no existe o la de el paciente ingreselos nuevamente");
				}		
				
	}
	
	
}
