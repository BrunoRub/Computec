package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Ingreso;
import com.proyecto.service.IngresoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("ingreso")
public class IngresoController {
	
	public Ingreso ingreso;
	
	@Autowired 
	private IngresoService service;
	
	@GetMapping()
	public List<Ingreso>listar(){
		return service.listar();
	}
	
	@GetMapping("{iding}")
	public Ingreso IngresoId(@PathVariable int iding){
		return service.obtenerPorId(iding).get();
	}
	
	@PostMapping
	public Ingreso registrar(Ingreso ingreso){
		return service.registrar(ingreso);
	}
	
	@PutMapping("{iding}")
	public ResponseEntity<Object>actualizar(@RequestBody Ingreso ingreso, @PathVariable int iding){
		ingreso.setIding(iding);
		service.actualziar(ingreso);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("{iding}")
	public void eliminar(@PathVariable int iding) {
		service.eliminar(iding);
	}

}
