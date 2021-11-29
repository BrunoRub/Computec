package com.proyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Estado;
import com.proyecto.repository.EstadoRepository;
import com.proyecto.service.EstadoService;

@Service
public class EstadoServiceImp implements EstadoService{
	
	@Autowired
	EstadoRepository repository;

	@Override
	public List<Estado> listar() {
		return (List<Estado>) repository.findAll();
	}

	

}
