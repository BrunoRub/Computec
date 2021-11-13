package com.proyecto.service;

import java.util.List;

import com.proyecto.entity.Venta;

public interface VentaService {

	public List<Venta>listaVentas();	
	public Venta registraVenta(Venta v);
	public Integer eliminaVenta(int id);
	public Venta actualizaVenta(Venta v);
}
