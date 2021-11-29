package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class EnlaceController {

	@RequestMapping("/")
	public String inicio() {return "inicio";  }
	
	@GetMapping("/login")
	public String login() {return "login";}
}
