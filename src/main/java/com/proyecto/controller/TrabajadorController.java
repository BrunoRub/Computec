package com.proyecto.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Trabajador;
import com.proyecto.service.TrabajadorService;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {
	
	public Trabajador trabajador;
	
	@Autowired
	private TrabajadorService service;
	
	/*@GetMapping("/iniciarSesion/{usuario}/{clave}")
	public Trabajador obtenerTrabajador(@PathVariable("usuario")String usuario, @PathVariable("clave")String clave) {
		this.trabajador = service.iniciarSesion(usuario, clave);
		return this.trabajador;
	}*/
	
	@GetMapping("/lista")
	public List<Trabajador>listar(){
		return service.listar();
	}
	
	@GetMapping("{idtra}")
	public Trabajador TrabajadorId(@PathVariable Long idtra){
		return service.obtenerPorId(idtra).get();
	}
	
	@PostMapping()
	public Trabajador registrar(Trabajador trabajador){
		return service.registrar(trabajador);
	}
	
	@PutMapping("{idtra}")
	public ResponseEntity<Object>actualizar(@RequestBody Trabajador trabajador, @PathVariable Long idtra){
		trabajador.setIdtra(idtra);
		service.actualizar(trabajador);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("{cod_prov}")
	public void eliminar(@PathVariable Long idtra) {
		service.eliminar(idtra);
	}
	
	@GetMapping("/usuarioSesion")
	public Trabajador usuarioSesion() {
		return this.trabajador;
	}
	
	@GetMapping("/cerrarSesion")
	public int cerrarSesion() {
		this.trabajador = null;		
		return 1;
	}
	
	@GetMapping("/auth/login")
	public String login(Model map) {
		map.addAttribute("trabajador", new Trabajador());
		return "login";
	}
	
	@GetMapping("/auth/registro")
	public String registroForm(Model map) {
		map.addAttribute("trabajador", new Trabajador());
		return "registro";
	}
	
	@PostMapping("/auth/registro")
	public String registro(@Valid @ModelAttribute Trabajador trabajador, BindingResult result, Model model){		
		if (result.hasErrors()) {
			return "redirect:auth/registro";
		}else {
			model.addAttribute("trabajador", service.registrar(trabajador));
		}
		return "redirect:/auth/login";
	}
	
	/*
	
	@GetMapping
	public String lista(Model map){
		map.addAttribute("trabajador", service.listar());		
		return "trabajador/listar";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model map){
		map.addAttribute("trabajador", new Trabajador());		
		return "trabajador/nuevo";
	}
	
	@PostMapping("/crea")
	public String crea(@ModelAttribute("trabajador")Trabajador trabajador){
		service.registrar(trabajador);
		return "redirect:/trabajador";
	}
	
	@GetMapping("/edita/{idtra}")
	public String edita(@ModelAttribute("idtra")Integer idtra, Model map){
		map.addAttribute("trabajador", service.obtenerPorId(idtra));		
		return "trabajador/editar";
	}
	
	@PostMapping("/actualiza")
	public String actualiza(@ModelAttribute("trabajador")Trabajador trabajador){
		service.actualizar(trabajador);		
		return "redirect:/trabajador";
	}
	
	@GetMapping("/elimina/{idtra}")
	public String elimina(@ModelAttribute("idtra")Integer idtra){
		service.eliminar(idtra);		
		return "redirect:/trabajador";
	}
	*/
}
