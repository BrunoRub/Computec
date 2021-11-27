package com.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyecto.entity.Proveedor;
import com.proyecto.service.ProveedorService;

@Controller
public class ProveedorController {
	
	@Autowired
	private ProveedorService service;
	
	@GetMapping("/proveedor")
	public String listar(Model map){
		map.addAttribute("listarProveedor", service.listar());
		return "proveedor/listar";
	}
	
	@GetMapping("/proveedor/nuevo")
	public String nuevo(Model map){
		map.addAttribute("proveedor", new Proveedor());
		return "proveedor/nuevo";
	}
	
	@PostMapping("/proveedor/crear")
	public String crear(@ModelAttribute("proveedor") Proveedor proveedor){
		service.registrar(proveedor);
		return "redirect:/proveedor";
	}
	
	@GetMapping("/proveedor/editar/{idprov}")
	public String editar(@ModelAttribute("idprov") Long idprov,Model map){
		map.addAttribute("proveedor", service.obtenerPorId(idprov));
		return "proveedor/editar";
	}
	
	@PostMapping("/proveedor/actualizar")
	public String actualizar(@ModelAttribute("proveedor") Proveedor proveedor){
		service.actualizar(proveedor);
		return "redirect:/proveedor";
	}
	
	@GetMapping("/proveedor/eliminar/{idprov}")
	public String eliminar(@ModelAttribute("idprov") Long idprov){
		service.eliminar(idprov);
		return "redirect:/proveedor";
	}
}
