package com.proyecto.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "proveedor")
@Getter
@Setter
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idprov;
	
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
	
}
