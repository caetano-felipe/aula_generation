package com.hellogeneration.helloTwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloObjetivos")
public class HelloTwoController {
	
	@GetMapping
	public String helloObjetivos() {
		return "Hello Generation! Meus objetivos de aprendizagem nessa"
				+ " semana, foram me dedicar ao máximo em MySQL, e agora"
				+ " com o Spring. Utilizei muita atenção aos detalhes"
				+ " para ser bem preciso nessas novas aprendizagens!";
	}

}
