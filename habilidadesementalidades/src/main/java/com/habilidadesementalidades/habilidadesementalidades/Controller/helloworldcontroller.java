package com.habilidadesementalidades.habilidadesementalidades.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")

public class helloworldcontroller {

	@GetMapping
	public String helloworld() {
		return "Persistência e Proatividade";
	}
}
