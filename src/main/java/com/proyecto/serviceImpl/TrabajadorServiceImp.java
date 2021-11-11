package com.proyecto.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Trabajador;
import com.proyecto.repository.TrabajadorRepository;
import com.proyecto.service.TrabajadorService;

@Service
public class TrabajadorServiceImp implements TrabajadorService{

	@Autowired
	TrabajadorRepository repository;
	
	@Override
	public Trabajador iniciarSesion(String usuario, String clave) {
		return repository.iniciarSesion(usuario, clave);
	}

	@Override
	public Trabajador registrar(Trabajador trabajador) {
		return repository.save(trabajador);
	}

	@Override
	public List<Trabajador> listaTrabajadores() {
		return repository.findAll();
	}

	@Override
	public Trabajador actualizar(Trabajador trabajador) {
		return repository.save(trabajador);
	}

	@Override
	public Integer eliminar(int idtra) {
		repository.deleteById(idtra);
		Optional<Trabajador>tra = repository.findById(idtra);
		if (tra.isEmpty()) {
			return -1;
		}
		return 1;
	}

	@Override
	public Optional<Trabajador> obtenerPorId(int idtra) {
		return repository.findById(idtra);
	}

}
