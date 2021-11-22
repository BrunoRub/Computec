package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class EnlaceController {

	@RequestMapping("/")
	public String inicio() {	return "inicio";  }
	
	@RequestMapping("/categoria")
	public String categoria() {	return "categoria/listar";  }
	
	@RequestMapping("/cliente")
	public String cliente() {	return "cliente/listar";  }
	
	@RequestMapping("/ingreso")
	public String ingreso() {	return "ingreso/listar";  }
	
	@RequestMapping("/producto")
	public String producto() {	return "producto/listar";  }
	
	@RequestMapping("/proveedor")
	public String proveedor() {	return "proveedor/listar";  }
	
	@RequestMapping("/trabajador")
	public String listatrabajador() {	return "trabajador/listar";  }
	
	@RequestMapping("/venta")
	public String ventas() {	return "venta/listar";  }
}
