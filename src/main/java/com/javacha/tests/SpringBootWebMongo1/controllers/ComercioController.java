package com.javacha.tests.SpringBootWebMongo1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javacha.tests.SpringBootWebMongo1.Services.ComercioService;
import com.javacha.tests.SpringBootWebMongo1.beans.Comentario;
import com.javacha.tests.SpringBootWebMongo1.beans.Comercio;
import com.javacha.tests.SpringBootWebMongo1.repo.ComercioRepository;




@RestController
@RequestMapping("/comercios")
public class ComercioController {
	
	@Autowired
	ComercioService comercioService;
	
	@Autowired
	ComercioRepository comercioRepository;
	
    @GetMapping(value = "")
    public List<Comercio> listAll() {
    	
    	return comercioService.findAll(); 
    
    }	
    
    @GetMapping(value = "/{id}")
    public Comercio getComercioById(@PathVariable String id) {
    	
    	return comercioRepository.findOne(id); 
  
    }	

    @GetMapping(value = "/{idComercio}/comentarios")
    public List<Comentario> listAllComentariosByComercio(@PathVariable String idComercio) {
    	
    	return comercioService.findComentariosByComercioId(idComercio); 
       
    }	

    
}
