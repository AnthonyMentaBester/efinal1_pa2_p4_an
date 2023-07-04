package com.example.demo.repository.modelo;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {

    @GeneratedValue(generator = "seq_doctor", strategy = GenerationType.SEQUENCE ) /// atributo quue permite hacer match
	@SequenceGenerator(name = "seq_doctor", sequenceName = "seq_doctor", allocationSize = 1)

    @Id
    @Column(name = "doc_id")
    private Integer id;
    @Column(name = "doc_cedula")
    private String cedula;
    @Column(name = "doc_nombre")
    private String nombre;
    @Column(name = "doc_apellido")
    private String apellido;
    @Column(name = "doc_fecha_nacimiento")
    private LocalDate fecha_nacimiento;
    @Column(name = "doc_num_consultorio")
    private String numConsultorio;
    @Column(name = "doc_cod_senecyt")
    private String codigo;
    @Column(name = "doc_genero")
    private String genero;



    @OneToMany(mappedBy = "doctor")
    private List<CitaMedica> citaMedicas;


    //set y get
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}



	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}



	public String getNumConsultorio() {
		return numConsultorio;
	}



	public void setNumConsultorio(String numConsultorio) {
		this.numConsultorio = numConsultorio;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public List<CitaMedica> getCitaMedicas() {
		return citaMedicas;
	}



	public void setCitaMedicas(List<CitaMedica> citaMedicas) {
		this.citaMedicas = citaMedicas;
	}

   
   
   
}

