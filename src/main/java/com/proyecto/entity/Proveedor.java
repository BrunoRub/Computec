package com.proyecto.entity;

import javax.persistence.Column;
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
	
	@Column(name = "razons", nullable = false, length = 45)
	private String razons;
	
	@Column(name = "ruc", nullable = false, length = 11)
	private String ruc;
	
	@Column(name = "direccion", nullable = false, length = 100)
	private String direccion;
	
	@Column(name = "telefono", nullable = false, length = 9)
	private String telefono;

	/*
	@Override
	public String toString() {
		return "Cliente [idprov=" + idprov + ", razons=" + razons + ", tipodoc=" + tipodoc + ", numdoc="
				+ numdoc + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}
	
	public String getDatos() {
		return getRazons() + " "+getNumdoc();
	}
	*/
}
