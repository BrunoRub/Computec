package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Categoria;
import com.proyecto.service.CategoriaService;

@RestController
@RequestMapping
public class CategoriaController {

	@Autowired
	CategoriaService service;
	
	@GetMapping("/categoria")
	public List<Categoria>lista(){
		return service.listaCategorias();
	}
	
}
