package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.repositorio.Repositorio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity
@Table(name = "pessoas")
public class Pessoa {
	
	@Autowired
	private Repositorio acao;
	
	@PostMapping("/pessoa/cadastrar")
	public Pessoa cadastrar(@RequestBody Pessoa pessoa) {
		return acao.save(pessoa);
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private int idade;
	
	public int getId() {
		return id;
	}	
	public void setId(int id) {
		this.id = id;
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
