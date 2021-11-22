package com.proyecto.entity;

import java.util.Date;

import javax.persistence.Column;
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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "detingreso")
@Getter
@Setter
public class DetIngrego {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iddeti;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iding")
	private Ingreso ingreso;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpro")
	private Producto producto;
	
	@Column(name = "precioc", nullable = false, length = 10)
	private double precioc;
		
	@Column(name = "preciov", nullable = false, length = 10)
	private double preciov;
	
	@Column(name = "stocki", nullable = false, length = 10)
	private int stocki;
	
	@Column(name = "stocka", nullable = false, length = 10)
	private int stocka;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecp;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecv;
	
}
