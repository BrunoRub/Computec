package com.proyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Categoria;
import com.proyecto.repository.CategoriaRepository;
import com.proyecto.service.CategoriaService;

@Service
public class CategoriaServiceImp implements CategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> obtenerCategoria() {
		return (List<Categoria>) categoriaRepository.findAll();
	}

}
