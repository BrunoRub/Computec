package com.proyecto.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.Cliente;
//import com.proyecto.entity.Producto;
import com.proyecto.repository.ClienteRepository;
import com.proyecto.service.ClienteService;

@Service
public class ClienteServiceImp implements ClienteService {

	@Autowired
	ClienteRepository repository;

	@Override
	public List<Cliente> listaClientes() {
		return  (List<Cliente>) repository.findAll();
	}

	@Override
	public Cliente registraCliente(Cliente cliente) {
		return repository.save(cliente);
	}

	@Override
	public Optional<Cliente> obtenerPorid(Long idcli) {
		return repository.findById(idcli);
	}

	@Override
	public Cliente actualizaCliente(Cliente cliente) {
		return repository.save(cliente);
	}

	@Override
	public Integer eliminarCliente(Long idcli) {
		repository.deleteById(idcli);
		Optional<Cliente> cli = repository.findById(idcli);
		if (cli.isPresent()) {
			return -1;
		}
		return 1;
	}

}
