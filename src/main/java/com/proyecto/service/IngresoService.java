package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.entity.Ingreso;

public interface IngresoService {

	public Ingreso registrar(Ingreso ingreso);
	public Ingreso actualziar(Ingreso ingreso);
	public Integer eliminar(int iding);
	public List<Ingreso>listar();
	Optional<Ingreso>obtenerPorId(int iding);
}
