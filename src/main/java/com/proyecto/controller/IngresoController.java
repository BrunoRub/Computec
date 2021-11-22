package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Ingreso;
import com.proyecto.entity.Proveedor;
import com.proyecto.service.IngresoService;
import com.proyecto.service.ProveedorService;
import com.proyecto.service.TrabajadorService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

//@RestController
//@RequestMapping("ingreso")
@Controller
public class IngresoController {
	
	//public Ingreso ingreso;
	
	@Autowired 
	private IngresoService service;
	
	@Autowired
	private ProveedorService pservice;
	
	@Autowired
	private TrabajadorService tservice;
	
	/*
	@GetMapping("/lista")
	public List<Ingreso>listar(){
		return service.listar();
	}
	
	@GetMapping("{iding}")
	public Ingreso IngresoId(@PathVariable Long iding){
		return service.obtenerPorId(iding).get();
	}
	
	@PostMapping
	public Ingreso registrar(Ingreso ingreso){
		return service.registrar(ingreso);
	}
	
	@PutMapping("{iding}")
	public ResponseEntity<Object>actualizar(@RequestBody Ingreso ingreso, @PathVariable Long iding){
		ingreso.setIding(iding);
		service.actualizar(ingreso);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("{iding}")
	public void eliminar(@PathVariable Long iding) {
		service.eliminar(iding);
	}
*/
	
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
