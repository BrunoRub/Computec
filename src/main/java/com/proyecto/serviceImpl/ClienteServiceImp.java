package com.proyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Cliente;
import com.proyecto.repository.ClienteRepository;
import com.proyecto.service.ClienteService;

@Service
public class ClienteServiceImp implements ClienteService{

	@Autowired
	ClienteRepository repository;
	
	@Override
	public List<Cliente> listaClientes() {
		return (List<Cliente>) repository.findAll();
	}

}
