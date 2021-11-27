package com.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import com.proyecto.entity.Venta;
import com.proyecto.service.ClienteService;
import com.proyecto.service.ProductoService;
import com.proyecto.service.TrabajadorService;
import com.proyecto.service.VentaService;

@Controller
public class VentaController {

	@Autowired
	VentaService ventaService;
	
	@Autowired
	ProductoService productoService;
	
	@Autowired
	TrabajadorService trabajadorService;
	
	@Autowired
	ClienteService clienteService;
	
	
	
	@GetMapping("/ventas")
	public String listaVenta(Model map){
		map.addAttribute("listaVenta", ventaService.listaVentas());
		return "venta/listar";
	}
	
	@GetMapping("/venta/nuevo")
	public String ventaNuevo(Model map) {
		map.addAttribute("venta", new Venta());
		map.addAttribute("listaProducto", productoService.obtenerProducto());
		map.addAttribute("listaTrabajador",trabajadorService.listar());
		map.addAttribute("listaCliente", clienteService.listaClientes());
		return "venta/nuevo";
	}
	
	@PostMapping("/venta/crear")
	public String ventaCrear(@ModelAttribute("venta") Venta venta) {
		ventaService.registraVenta(venta);
		return "redirect:/venta";
	}
	
	@GetMapping("venta/editar/{idven}")
	public String ventaEditar(@ModelAttribute("idven") Long id, Model map) {
		
		map.addAttribute("venta", ventaService.obtenerPorId(id));
		map.addAttribute("listaProducto", productoService.obtenerProducto());
		map.addAttribute("listaTrabajador",trabajadorService.listar());
		map.addAttribute("listaCliente", clienteService.listaClientes());
		return "venta/editar";
	}
	@PostMapping("venta/actualizar")
	public String ventaActualizar(@ModelAttribute("venta") Venta venta) {
		ventaService.actualizaVenta(venta);
		return "redirect:/venta";
	}
	
	@GetMapping("venta/eliminar/{id}")
	public String productoEliminar(@ModelAttribute("id") Long id) {
		productoService.eliminar(id);
		return "redirect:/venta";
	}
	
	
	
}
