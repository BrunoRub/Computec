package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.entity.Producto;

public interface ProductoService {

	Producto registrar(Producto producto);
	Producto actualizar(Producto producto);	
	Integer eliminar(Long id);	
	Optional<Producto> obtenerPorId(Long idpro);
	List<Producto> obtenerProducto();
}
