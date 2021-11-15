package com.proyecto.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.entity.Trabajador;
import com.proyecto.service.TrabajadorService;

@Controller
@RequestMapping("/private")
public class PrivateController {
	/*
	@Autowired
	private TrabajadorService service;
	
	@GetMapping("/index")
	public String index(Authentication auth , HttpSession sesion) {
		
		String username = auth.getName();
		if (sesion.getAttribute("trabajador")==null) {
			Trabajador trabajador = service.findByUsername(username);
			trabajador.setClave(null);
			sesion.setAttribute("trabajador", trabajador);
		}
		return "index";
	}
	*/
}
