package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.entity.Trabajador;

public interface TrabajadorService {
	
	public Trabajador iniciarSesion(String usuario, String clave);
	public Trabajador registrar(Trabajador trabajador);
	public Trabajador actualizar(Trabajador trabajador);
	public Integer eliminar(int idtra);
	public List<Trabajador>listaTrabajadores();	
	Optional<Trabajador>obtenerPorId(int idtra);
}
