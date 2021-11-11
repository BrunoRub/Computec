package com.proyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Venta;
import com.proyecto.repository.VentaRepository;
import com.proyecto.service.VentaService;

@Service
public class VentaServiceImp implements VentaService{
	
	@Autowired
	VentaRepository repository;

	@Override
	public List<Venta> listaVentas() {		
		return repository.findAll();
	}

}
