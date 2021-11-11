package com.proyecto.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "detventa")
public class DetVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddetv;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idven")
	private Venta venta;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iddeti")
	private DetIngrego detingreso;
	
	private int cantidad;
	
	private double preciov;
	
	private double descuento;

	public int getIddetv() {
		return iddetv;
	}

	public void setIddetv(int iddetv) {
		this.iddetv = iddetv;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public DetIngrego getDetingreso() {
		return detingreso;
	}

	public void setDetingreso(DetIngrego detingreso) {
		this.detingreso = detingreso;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPreciov() {
		return preciov;
	}

	public void setPreciov(double preciov) {
		this.preciov = preciov;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
}
