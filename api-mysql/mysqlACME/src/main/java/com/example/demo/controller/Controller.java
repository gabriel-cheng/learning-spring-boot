package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pessoa;
import com.example.demo.repositorio.Repositorio;

@RestController("/")
public class Controller {
	
	@Autowired
	private Repositorio acao;
	
	@PostMapping
	public Pessoa cadastrar(@RequestBody Pessoa pessoa) {
		return acao.save(pessoa);
	}
	
	@GetMapping
	public String mensagem() {
		return "Olá, mundo";
	}
	
	@PostMapping("/pessoa")
	public Pessoa pessoa(@RequestBody Pessoa p) {
		return p;
	}
	
}
