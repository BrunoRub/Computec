package com.proyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Proveedor;
import com.proyecto.repository.ProveedorRepository;
import com.proyecto.service.ProveedorService;

@Service
public class ProveedorServiceImp implements ProveedorService{

	@Autowired
	ProveedorRepository repository;
	
	@Override
	public List<Proveedor> listaProveedores() {
		return repository.findAll();
	}

}
