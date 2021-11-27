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
		
		@GetMapping("/cliente")
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
		public String clienteEditar(@ModelAttribute("idcli") Long idcli, Model map) {
			map.addAttribute("cliente", service.obtenerPorid(idcli));
			return "cliente/editar";
		}
		
		@PostMapping("cliente/actualizar")
		public String clienteActualizar(@ModelAttribute("cliente") Cliente cliente) {
			service.actualizaCliente(cliente);
			return "redirect:/cliente";
		}
		
		@GetMapping("cliente/eliminar/{idcli}")
		public String clienteEliminar(@ModelAttribute("idcli") Long idcli) {
			service.eliminarCliente(idcli);
			return "redirect:/cliente";
		}
		
}
