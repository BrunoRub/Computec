package com.proyecto.serviceImpl;

import java.util.List;
import java.util.Optional;

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
	public Ingreso registrar(Ingreso ingreso) {
		return repository.save(ingreso);
	}

	@Override
	public Ingreso actualizar(Ingreso ingreso) {
		return repository.save(ingreso);
	}

	@Override
	public Integer eliminar(Long iding) {
		repository.deleteById(iding);
		Optional<Ingreso>ing = repository.findById(iding);
		if (ing.isPresent()) {
			return -1;
		}
		return 1;
	}

	@Override
	public List<Ingreso> listar() {
		return (List<Ingreso>) repository.findAll();
	}

	@Override
	public Optional<Ingreso> obtenerPorId(Long iding) {
		return repository.findById(iding);
	}
	
	

}
