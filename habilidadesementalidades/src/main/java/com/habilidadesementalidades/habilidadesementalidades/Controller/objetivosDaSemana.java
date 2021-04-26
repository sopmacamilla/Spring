package com.habilidadesementalidades.habilidadesementalidades.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivosDaSemana")
public class objetivosDaSemana {
	
	@GetMapping
	public String objetivosDaSemana() {
		return "Absorver o conteúdo e estudar após a aula";
	}
}
