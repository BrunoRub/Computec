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

import com.proyecto.entity.Proveedor;
import com.proyecto.service.ProveedorService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("proveedor")
public class ProveedorController {

	public Proveedor proveedor;
	
	@Autowired
	private ProveedorService service;
	
	@GetMapping("/lista")
	public List<Proveedor>listar(){
		return service.listar();
	}
	
	@GetMapping("{idprov}")
	public Proveedor ProveedorId(@PathVariable Long idprov){
		return service.obtenerPorId(idprov).get();
	}
	
	@PostMapping
	public Proveedor registrar(Proveedor proveedor){
		return service.registrar(proveedor);
	}
	
	@PutMapping("{idprov}")
	public ResponseEntity<Object>actualizar(@RequestBody Proveedor proveedor, @PathVariable Long idprov){
		proveedor.setIdprov(idprov);
		service.actualizar(proveedor);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("{idprov}")
	public void eliminar(@PathVariable Long idprov) {
		service.eliminar(idprov);
	}
}
