package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Cliente;
import com.proyecto.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

		@Autowired
		ClienteService service;
		
		@GetMapping("/lista")
		public List<Cliente> listarCliente(){
			return service.listaClientes();
		}
		
}
