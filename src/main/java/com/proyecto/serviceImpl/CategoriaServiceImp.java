package com.proyecto.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Categoria;
import com.proyecto.repository.CategoriaRepository;
import com.proyecto.service.CategoriaService;

@Service
public class CategoriaServiceImp implements CategoriaService{
	
	@Autowired
	private CategoriaRepository repository;

	@Override
	public Categoria registrar(Categoria categoria) {
		return repository.save(categoria);
	}

	@Override
	public Categoria actualizar(Categoria categoria) {
		return repository.save(categoria);
	}

	@Override
	public Integer eliminar(Long idcategoria) {
		repository.deleteById(idcategoria);
		Optional<Categoria>cat = repository.findById(idcategoria);
		if (cat.isPresent()) {
			return -1;
		}
		return 1;
	}

	@Override
	public List<Categoria> listar() {
		return (List<Categoria>) repository.findAll();
	}

	@Override
	public Optional<Categoria> obtenerPorId(Long idcategoria) {
		return repository.findById(idcategoria);
	}

	

}
