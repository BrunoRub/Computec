package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Trabajador;
import com.proyecto.service.TrabajadorService;

@RestController
@RequestMapping("trabajador")
public class TrabajadorController {
	
	public Trabajador trabajador;
	
	@Autowired
	private TrabajadorService service;
	
	@GetMapping("/iniciarSesion/{usuario}/{clave}")
	public Trabajador obtenerTrabajador(@PathVariable("usuario")String usuario, @PathVariable("clave")String clave) {
		this.trabajador = service.iniciarSesion(usuario, clave);
		return this.trabajador;
	}
	
	@GetMapping()
	public List<Trabajador>listar(){
		return service.listar();
	}
	
	@GetMapping("{idtra}")
	public Trabajador TrabajadorId(@PathVariable int idtra){
		return service.obtenerPorId(idtra).get();
	}
	
	@PostMapping()
	public Trabajador registrar(Trabajador trabajador){
		return service.registrar(trabajador);
	}
	
	@PutMapping("{idtra}")
	public ResponseEntity<Object>actualizar(@RequestBody Trabajador trabajador, @PathVariable int idtra){
		trabajador.setIdtra(idtra);
		service.actualizar(trabajador);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("{cod_prov}")
	public void eliminar(@PathVariable int idtra) {
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

}
