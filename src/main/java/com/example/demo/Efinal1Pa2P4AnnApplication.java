package com.example.demo;


import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.CitaMedicaService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PacienteService;

@SpringBootApplication
public class Efinal1Pa2P4AnnApplication implements CommandLineRunner{

	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PacienteService pacienteService;
	
	@Autowired
	private CitaMedicaService citaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4AnnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Doctor doc = new Doctor();
        doc.setCedula("1749985740");
        doc.setNombre("Juan");
        doc.setApellido("Gutierrez");
        doc.setFecha_nacimiento(LocalDate.of(1999, 05, 01));
        doc.setNumConsultorio("23");
        doc.setCodigo("47a4");
        doc.setGenero("Masculino");
        this.doctorService.agregar(doc);


        Paciente pas = new Paciente();
        pas.setCedula("1765536899");
        pas.setNombre("Jacinto");
        pas.setApellido("Alvarez");
        pas.setFecha_nacimiento(LocalDate.of(2000, 10, 8));
        pas.setCodSeguro("65aaaa77");
        pas.setEstatura("170CM");
        pas.setPeso("40 KG");
        pas.setGenero("Masculino");
        this.pacienteService.agregar(pas);


        
        this.citaMedicaService.agendarCita("1", LocalDate.now(), new BigDecimal(60), "ELOY ALFARO - calle de las flores", "1749985740", "1765536899");
        this.citaMedicaService.actualizar("1", "gripe", "200Gm de parasetamol cada 3 horas", LocalDate.of(2023, 07, 04));
        
   
	}

}
