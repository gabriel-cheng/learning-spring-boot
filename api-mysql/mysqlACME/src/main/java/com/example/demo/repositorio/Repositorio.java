package com.example.demo.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Pessoa;

import jakarta.persistence.Entity;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {
	
}
