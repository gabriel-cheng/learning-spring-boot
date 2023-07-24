package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@RequestMapping("/soma")
	public int soma(@RequestParam("num1, num2") int num1, int num2) {
		
	}
	
}
