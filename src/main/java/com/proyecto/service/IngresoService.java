package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.entity.Ingreso;

public interface IngresoService {

	public Ingreso registrar(Ingreso ingreso);
	public Ingreso actualizar(Ingreso ingreso);
	public Integer eliminar(Long iding);
	public List<Ingreso>listar();
	Optional<Ingreso>obtenerPorId(Long iding);
	
}
