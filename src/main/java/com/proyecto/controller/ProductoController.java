package com.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyecto.entity.Producto;
import com.proyecto.service.CategoriaService;
import com.proyecto.service.EstadoService;
import com.proyecto.service.ProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private EstadoService eservice;
	
	@GetMapping("/productos")
	public String listProductos(Model map) {
		map.addAttribute("listarProductos", productoService.obtenerProducto());
		return "productos/listar";
	}
	
	@GetMapping("/productos/nuevo")
	public String productoNuevo(Model map) {
		map.addAttribute("producto", new Producto());
		map.addAttribute("listaCategoria", categoriaService.listar());
		map.addAttribute("listarEstado",eservice.listar());
		return "productos/nuevo";
	}
	
	@PostMapping("/productos/crear")
	public String productoCrear(@ModelAttribute("producto") Producto producto) {
		productoService.registrar(producto);
		return "redirect:/productos";
	}
	
	@GetMapping("productos/editar/{idpro}")
	public String productoEditar(@ModelAttribute("id") Long id, Model map) {
		map.addAttribute("producto", productoService.obtenerPorId(id));
		map.addAttribute("listaCategoria", categoriaService.listar());
		map.addAttribute("listarEstado",eservice.listar());
		return "productos/editar";
	}
	
	@PostMapping("productos/actualizar")
	public String productoActualizar(@ModelAttribute("producto") Producto producto) {
		productoService.actualizar(producto);
		return "redirect:/productos";
	}
	
	@GetMapping("productos/eliminar/{id}")
	public String productoEliminar(@ModelAttribute("id") Long id) {
		productoService.eliminar(id);
		return "redirect:/productos";
	}

}
