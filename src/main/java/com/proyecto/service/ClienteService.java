package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.entity.Cliente;

public interface ClienteService {

	public List<Cliente>listaClientes();
	public Cliente registraCliente(Cliente cliente);
	public Optional<Cliente> obtenerPorid(Long idcli);
	public Cliente actualizaCliente(Cliente cliente);
	public Integer eliminarCliente(Long idcli);
	
}
