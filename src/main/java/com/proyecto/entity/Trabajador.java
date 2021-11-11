package com.proyecto.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "trabajador")
@Getter
@Setter
public class Trabajador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idtra;
	
	private int nombre;
	
	private int apellido;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecnac;
	
	private int numdoc;
	
	private int direccion;
	
	private int telefono;
	
	private int email;
	
	private int acceso;

	private int usuario;
	
	private int clave;

	@Override
	public String toString() {
		return "Cliente [idtra=" + idtra + ", nombre=" + nombre + ", apellido=" + apellido + ", fecnac="
				+ fecnac + ", numdoc=" + numdoc + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", email=" + email + ", acceso=" + acceso + ", usuario=" + usuario + ", clave=" + clave + "]";
	}
	
	public String getDatos() {
		return getNombre() + " "+getApellido();
	}
	
	
}
