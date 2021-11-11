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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "detingreso")
public class DetIngrego {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddeti;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iding")
	private Ingreso ingreso;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpro")
	private Producto producto;
	
	private double precioc;
	
	private double preciov;
	
	private int stocki;
	
	private int stocka;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecp;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecv;

	public int getIddeti() {
		return iddeti;
	}

	public void setIddeti(int iddeti) {
		this.iddeti = iddeti;
	}

	public Ingreso getIngreso() {
		return ingreso;
	}

	public void setIngreso(Ingreso ingreso) {
		this.ingreso = ingreso;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public double getPrecioc() {
		return precioc;
	}

	public void setPrecioc(double precioc) {
		this.precioc = precioc;
	}

	public double getPreciov() {
		return preciov;
	}

	public void setPreciov(double preciov) {
		this.preciov = preciov;
	}

	public int getStocki() {
		return stocki;
	}

	public void setStocki(int stocki) {
		this.stocki = stocki;
	}

	public int getStocka() {
		return stocka;
	}

	public void setStocka(int stocka) {
		this.stocka = stocka;
	}

	public Date getFecp() {
		return fecp;
	}

	public void setFecp(Date fecp) {
		this.fecp = fecp;
	}

	public Date getFecv() {
		return fecv;
	}

	public void setFecv(Date fecv) {
		this.fecv = fecv;
	}
	
	
}
