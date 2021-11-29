package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.entity.Trabajador;

public interface TrabajadorService {
	
	public Trabajador registrar(Trabajador trabajador);
	public Trabajador actualizar(Trabajador trabajador);
	public Integer eliminar(Long idtra);
	public List<Trabajador>listar();	
	Optional<Trabajador>obtenerPorId(Long idtra);
	
}
