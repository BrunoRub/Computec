package com.proyecto.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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
	private Long idproducto;

	@Column(name = "descripcion", nullable = false, length = 50)
	private String descripcion;

	@Column(name = "precio", precision = 10, scale = 2)
	private BigDecimal precio;

	private int stock;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecvencimiento")
	private LocalDate fecvencimiento;

	@Column(columnDefinition = "TINYINT")
	private int estado;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	private Categoria categoria;

}
