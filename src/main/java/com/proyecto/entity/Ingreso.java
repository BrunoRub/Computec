package com.proyecto.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ingreso")
@Getter
@Setter
public class Ingreso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iding;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpro")
	private Producto producto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idprov")
	private Proveedor proveedor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtra")
	private Trabajador trabajador;	
	
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;	
    
	private int cantidad;
	
}
