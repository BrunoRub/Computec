package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnlaceController {

	@RequestMapping("/verInicio")
	public String verInicio() {	return "inicio";  }
}
