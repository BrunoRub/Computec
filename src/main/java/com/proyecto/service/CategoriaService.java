package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.entity.Categoria;

public interface CategoriaService {
	
	Categoria registrar(Categoria categoria);
	Categoria actualizar(Categoria categoria);
	Integer eliminar(Long idcat);
	List<Categoria> listar();
	Optional<Categoria>obtenerPorId(Long idcat);

}
