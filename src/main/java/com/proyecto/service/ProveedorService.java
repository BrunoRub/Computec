package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.entity.Proveedor;

public interface ProveedorService {

	public Proveedor registrar(Proveedor proveedor);
	public Proveedor actualizar(Proveedor proveedor);
	public Integer eliminar(int  idprov);
	public List<Proveedor>listar();
	Optional<Proveedor>obtenerPorId(int idprov);
}
