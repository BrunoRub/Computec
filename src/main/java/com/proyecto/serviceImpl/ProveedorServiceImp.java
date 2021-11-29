package com.proyecto.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Proveedor;
import com.proyecto.repository.ProveedorRepository;
import com.proyecto.service.ProveedorService;

@Service
public class ProveedorServiceImp implements ProveedorService {

	@Autowired
	ProveedorRepository repository;

	@Override
	public Proveedor registrar(Proveedor proveedor) {
		return repository.save(proveedor);
	}

	@Override
	public Proveedor actualizar(Proveedor proveedor) {
		return repository.save(proveedor);
	}

	@Override
	public Integer eliminar(Long idprov) {
		repository.deleteById(idprov);
		Optional<Proveedor> pro = repository.findById(idprov);
		if (pro.isPresent()) {
			return -1;
		}
		return 1;
	}

	@Override
	public List<Proveedor> listar() {
		return (List<Proveedor>) repository.findAll();
	}

	@Override
	public Optional<Proveedor> obtenerPorId(Long idprov) {
		return repository.findById(idprov);
	}

}
