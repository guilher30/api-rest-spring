package com.projetosm.library.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetosm.library.entities.Livro;
import com.projetosm.library.repositories.LivroRepository;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {
	@Autowired
	private LivroRepository repository;
	
	@GetMapping
	public List<Livro> findAll(){
		List<Livro> result = repository.findAll();
		return result;
	}
	
	
	@GetMapping(value = "/{id}")
	public Livro findById(@PathVariable Long id){
		Livro result = repository.findById(id).get();
		
		return result;
	}
	
	@PostMapping
	public Livro insert(@RequestBody Livro livro){
		Livro result = repository.save(livro);
		
		return result;
	}
	@DeleteMapping(value = "/{id}")
	public Livro deleteById(@PathVariable Long id){
		Livro result = repository.findById(id).get();
		 repository.deleteById(id);
		
		return result;
	}
	
	
}
