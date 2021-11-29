package com.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.proyecto.entity.Categoria;
import com.proyecto.service.CategoriaService;
import com.proyecto.service.EstadoService;

@Controller
public class CategoriaController {

	@Autowired
	private CategoriaService service;
	
	@Autowired
	private EstadoService eservice;
	
	@GetMapping("/categoria")
	public String listar(Model map) {
		map.addAttribute("listarCategoria",service.listar());
		return "categoria/listar";
	}
	
	@GetMapping("/categoria/nuevo")
	public String nuevo(Model map){
		map.addAttribute("categoria", new Categoria());
		map.addAttribute("listarEstado",eservice.listar());
		return "categoria/nuevo";
	}
	
	@PostMapping("/categoria/crear")
	public String crear(@ModelAttribute("categoria") Categoria categoria){
		service.registrar(categoria);
		return "redirect:/categoria";
	}
	
	@GetMapping("/categoria/editar/{idcat}")
	public String editar(@ModelAttribute("idcat") Long idcat,Model map){
		map.addAttribute("categoria", service.obtenerPorId(idcat));
		map.addAttribute("listarEstado",eservice.listar());
		return "categoria/editar";
	}
	
	@PostMapping("/categoria/actualizar")
	public String actualizar(@ModelAttribute("categoria") Categoria categoria){
		service.actualizar(categoria);
		return "redirect:/categoria";
	}
	
	@GetMapping("/categoria/eliminar/{idcat}")
	public String eliminar(@ModelAttribute("idcat") Long idcat){
		service.eliminar(idcat);
		return "redirect:/categoria";
	}
}
