package com.proyecto.entity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class EnlaceController {

	@RequestMapping("/")
	public String login() {	return "login";  }	
	
	@RequestMapping("/inicio")
	public String inicio() {	return "inicio";  }	
	
	@RequestMapping("/categoria")
	public String categoria() {	return "categoria";  }
	
	@RequestMapping("/cliente")
	public String cliente() {	return "cliente";  }
	
	@RequestMapping("/ingreso")
	public String ingreso() {	return "ingreso";  }
	
	@RequestMapping("/producto")
	public String producto() {	return "producto";  }
	
	@RequestMapping("/proveedor")
	public String proveedor() {	return "proveedor";  }
		
	@RequestMapping("/trabajador")
	public String trabajador() {	return "trabajador";  }
	
	@RequestMapping("/venta")
	public String ventas() {	return "venta";  }
}
