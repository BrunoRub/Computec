package com.proyecto.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyecto.entity.Cliente;
import com.proyecto.service.ClienteService;

@Controller
public class ClienteController {

		@Autowired
		ClienteService service;
		
		@GetMapping("/clientes")
		public String listarCliente(Model map){
			map.addAttribute("listaCliente", service.listaClientes());
			return "cliente/listar";
					
		}
		
		@GetMapping("/cliente/nuevo")
		public String clienteNuevo(Model map) {
			map.addAttribute("cliente", new Cliente());
			return "cliente/nuevo";
		}
		
		@PostMapping("/cliente/crear")
		public String clienteCrear(@ModelAttribute("cliente") Cliente cliente) {
			service.registraCliente(cliente);
			return "redirect:/cliente";
		}
		
		@GetMapping("cliente/editar/{idcli}")
		public String clienteEditar(@ModelAttribute("id") Long id, Model map) {
			map.addAttribute("cliente", service.obtenerPorid(id));
			return "cliente/editar";
		}
		
		@PostMapping("cliente/actualizar")
		public String clienteActualizar(@ModelAttribute("cliente") Cliente cliente) {
			service.actualizaCliente(cliente);
			return "redirect:/cliente";
		}
		
		@GetMapping("cliente/eliminar/{id}")
		public String clienteEliminar(@ModelAttribute("id") Long id) {
			service.eliminarCliente(id);
			return "redirect:/cliente";
		}

		
		
		
		
		
		
}
