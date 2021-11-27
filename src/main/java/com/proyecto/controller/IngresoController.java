package com.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyecto.entity.Ingreso;
import com.proyecto.service.IngresoService;
import com.proyecto.service.ProductoService;
import com.proyecto.service.ProveedorService;
import com.proyecto.service.TrabajadorService;

@Controller
public class IngresoController {
	
	@Autowired 
	private IngresoService service;
	
	@Autowired
	private ProveedorService pservice;
	
	@Autowired
	private TrabajadorService tservice;
	
	@Autowired
	private ProductoService producto;
	
	@GetMapping("/ingreso")
	public String listar(Model map){
		map.addAttribute("listarIngresos", service.listar());
		return "ingreso/listar";
	}
	
	@GetMapping("/ingreso/nuevo")
	public String nuevo(Model map){
		map.addAttribute("ingreso", new Ingreso());
		map.addAttribute("listaProveedor",pservice.listar());
		map.addAttribute("listaTrabajador",tservice.listar());
		map.addAttribute("listaProducto",producto.obtenerProducto());
		return "ingreso/nuevo";
	}
	
	@PostMapping("/ingreso/crear")
	public String crear(@ModelAttribute("ingreso") Ingreso ingreso){
		service.registrar(ingreso);
		return "redirect:/ingreso";
	}
	
	@GetMapping("/ingreso/editar/{iding}")
	public String editar(@ModelAttribute("iding") Long iding,Model map){
		map.addAttribute("ingreso", service.obtenerPorId(iding));
		map.addAttribute("listaProveedor",pservice.listar());
		map.addAttribute("listaTrabajador",tservice.listar());
		map.addAttribute("listaProducto",producto.obtenerProducto());
		return "ingreso/editar";
	}
	
	@PostMapping("/ingreso/actualizar")
	public String actualizar(@ModelAttribute("ingreso") Ingreso ingreso){
		service.actualizar(ingreso);
		return "redirect:/ingreso";
	}
	
	@GetMapping("/ingreso/eliminar/{iding}")
	public String eliminar(@ModelAttribute("iding") Long iding){
		service.eliminar(iding);
		return "redirect:/ingreso";
	}
}
