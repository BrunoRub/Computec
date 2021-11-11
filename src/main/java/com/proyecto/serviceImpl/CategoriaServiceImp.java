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
	CategoriaRepository repository;

	@Override
	public List<Categoria> listaCategorias() {
		return repository.findAll();
	}

}
