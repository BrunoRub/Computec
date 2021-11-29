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

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "venta")
@Getter
@Setter
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idven;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcli")
	private Cliente cliente;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtra")
	private Trabajador trabajador;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpro")
	private Producto producto;
	
	private int cantidad;
	
	private double preciov;
	
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;
	
	private String tipocom;	
	
}
