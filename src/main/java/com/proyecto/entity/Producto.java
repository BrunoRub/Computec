package com.proyecto.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "producto")
@Getter
@Setter
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpro;

	//@Column(name = "descripcion", nullable = false, length = 50)
	private String descripcion;

	//@Column(name = "precio", precision = 10, scale = 2)
	private BigDecimal precio;

	//@Column(name = "stock", nullable = false, length = 10)
	private int stock;

	//@Column(columnDefinition = "TINYINT")
	private int estado;

	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	private Categoria categoria;

}
