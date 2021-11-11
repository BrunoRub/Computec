package com.proyecto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idprov;
	
	private String razons;
	
	private String tipodoc;
	
	private String numdoc;
	
	private String direccion;
	
	private String telefono;
	
	private String email;

	@Override
	public String toString() {
		return "Cliente [idprov=" + idprov + ", razons=" + razons + ", tipodoc=" + tipodoc + ", numdoc="
				+ numdoc + ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email
				+ "]";
	}
	
	public String getDatos() {
		return getRazons() + " "+getNumdoc();
	}
	
	public int getIdprov() {
		return idprov;
	}

	public void setIdprov(int idprov) {
		this.idprov = idprov;
	}

	public String getRazons() {
		return razons;
	}

	public void setRazons(String razons) {
		this.razons = razons;
	}

	public String getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
