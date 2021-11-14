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

	public int getIdtra() {
		return idtra;
	}

	public void setIdtra(int idtra) {
		this.idtra = idtra;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public int getApellido() {
		return apellido;
	}

	public void setApellido(int apellido) {
		this.apellido = apellido;
	}

	public Date getFecnac() {
		return fecnac;
	}

	public void setFecnac(Date fecnac) {
		this.fecnac = fecnac;
	}

	public int getNumdoc() {
		return numdoc;
	}

	public void setNumdoc(int numdoc) {
		this.numdoc = numdoc;
	}

	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public int getAcceso() {
		return acceso;
	}

	public void setAcceso(int acceso) {
		this.acceso = acceso;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}
	
	
	
}
