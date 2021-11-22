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
@Table(name = "cliente")
@Getter
@Setter
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcli;
	
	private String nombre;
	
	private String apellido;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecnac;
	
	private String tipodoc;
	
	private String numdoc;
	
	private String direccion;
	
	private String telefono;
	
	private String email;

	@Override
	public String toString() {
		return "Cliente [idcli=" + idcli + ", nombre=" + nombre + ", apellido=" + apellido + ", fecnac="
				+ fecnac + ", tipodoc=" + tipodoc + ", numdoc=" + numdoc + ", direccion=" + direccion
				+ ", telefono=" + telefono +" , email=" + email + "]";
	}
	
	public String getDatos() {
		return getNombre() + " "+getApellido();
	}
}	