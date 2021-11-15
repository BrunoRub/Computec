package com.proyecto.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trabajador")
public class Trabajador implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idtra;
	
	@Column(name = "nombre", nullable = false, length = 45)
	private String nombre;
	
	@Column(name = "apellido", nullable = false, length = 45)
	private String apellido;
	
	@Column(name = "numdoc", nullable = false, length = 8)
	private String numdoc;
	
	@Column(name = "direccion", nullable = false, length = 100)
	private String direccion;
	
	@Column(name = "telefono", nullable = false, length = 10)
	private String telefono;
	
	@Column(name = "username", nullable = false, length = 20)
	private String username;
	
	@Column(name = "clave", nullable = false, length = 20)
	private String clave;

	public Trabajador(int idtra, String nombre, String apellido, String numdoc, String direccion, String telefono,
			String username, String clave) {
		super();
		this.idtra = idtra;
		this.nombre = nombre;
		this.apellido = apellido;
		this.numdoc = numdoc;
		this.direccion = direccion;
		this.telefono = telefono;
		this.username = username;
		this.clave = clave;
	}

	public Trabajador() {
		super();
	}

	public int getIdtra() {
		return idtra;
	}

	public void setIdtra(int idtra) {
		this.idtra = idtra;
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

	public String getNumdoc() {
		return numdoc;
	}

	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String usuario) {
		this.username = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*
	@Override
	public String toString() {
		return "Cliente [idtra=" + idtra + ", nombre=" + nombre + ", apellido=" + apellido + ", numdoc=" + numdoc + 
				", direccion=" + direccion + ", telefono=" + telefono +  ", usuario=" + usuario + ", clave=" + clave + "]";
	}
	
	public String getDatos() {
		return getNombre() + " "+getApellido();
	}*/

	
}