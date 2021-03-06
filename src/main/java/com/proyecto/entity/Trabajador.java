package com.proyecto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "trabajador")
@Getter
@Setter
public class Trabajador{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtra;
	
	private String nombre;
	
	private String apellido;
	
	private String dni;
	
	private String direccion;
	
	private String telefono;
	
}