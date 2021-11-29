package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.entity.Venta;

public interface VentaService {

	public List<Venta>listaVentas();	
	public Venta registraVenta(Venta v);
	public Integer eliminaVenta(Long idven);
	public Venta actualizaVenta(Venta v);
	Optional<Venta> obtenerPorId(Long idven);
	
}
