package br.com.generation.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorldTwo")
public class HelloWorldTwoController {
	
	@GetMapping
	public String hello() {
		return "Gostaria de me sentir confiante para fazer uma aplicação String.";
	}

}
