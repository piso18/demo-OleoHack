package com.javacha.tests.SpringBootWebMongo1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacha.tests.SpringBootWebMongo1.beans.Comentario;
import com.javacha.tests.SpringBootWebMongo1.repo.ComentarioRepository;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {	
	
	
	@Autowired
	ComentarioRepository comentarioRepository;


@GetMapping(value = "")
public List<Comentario> listAll() {
	
	return comentarioRepository.findAll(); 
    
}	
	
	

}
