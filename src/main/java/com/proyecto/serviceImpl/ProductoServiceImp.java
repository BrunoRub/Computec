package com.proyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Producto;
import com.proyecto.repository.ProductoRepository;
import com.proyecto.service.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService{
	
	@Autowired
	ProductoRepository repository;

	@Override
	public List<Producto> listaProductos() {
		return repository.findAll();
	}
 
}
