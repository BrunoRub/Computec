package com.proyecto.entity;

import java.util.Date;

import javax.persistence.Column;
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

	@Column(name = "nombre", nullable = false, length = 45)
	private String nombre;
	
	@Column(name = "apellido", nullable = false, length = 45)
	private String apellido;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecnac;
	
	@Column(name = "tipodoc", nullable = false, length = 20)
	private String tipodoc;
	
	@Column(name = "numdoc", nullable = false, length = 11)
	private String numdoc;
	
	@Column(name = "direccion", nullable = false, length = 100)
	private String direccion;
	
	@Column(name = "telefono", nullable = false, length = 9)
	private String telefono;
	

	@Override
	public String toString() {
		return "Cliente [idcli=" + idcli + ", nombre=" + nombre + ", apellido=" + apellido + ", fecnac="
				+ fecnac + ", tipodoc=" + tipodoc + ", numdoc=" + numdoc + ", direccion=" + direccion
				+ ", telefono=" + telefono +"]";
	}
	
	public String getDatos() {
		return getNombre() + " "+getApellido();
	}
}	