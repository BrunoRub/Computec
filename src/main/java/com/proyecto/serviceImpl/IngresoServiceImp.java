package com.proyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Ingreso;
import com.proyecto.repository.IngresoRepository;
import com.proyecto.service.IngresoService;

@Service
public class IngresoServiceImp implements IngresoService{

	@Autowired
	IngresoRepository repository;
	
	@Override
	public List<Ingreso> listaIngresos() {
		return repository.findAll();
	}

}
