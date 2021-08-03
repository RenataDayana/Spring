package br.com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/helloWorld")
public class HelloWorldController {
	
	@GetMapping
	public String hello() {
		return "Para esta atividade utilizei a mentalidade de crescimento e a habilidade de atenção aos detalhes. ";
		
		
	}

}
