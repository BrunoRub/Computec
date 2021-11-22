package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.Venta;
import com.proyecto.service.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {

	@Autowired
	VentaService service;
	
	@GetMapping("/lista")
	public List<Venta> listaVenta(){
		return service.listaVentas();
	}
	
	@PostMapping("/registraVenta")
	public Venta registraVenta(Venta v) {
		return service.registraVenta(v);
	}
	
	@DeleteMapping("eliminaVenta/{idven}")
	public void eliminarVenta(@PathVariable Long id) {
		service.eliminaVenta(id);
	}
	
}
