package com.javacha.tests.SpringBootWebMongo1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javacha.tests.SpringBootWebMongo1.beans.Usuario;
import com.javacha.tests.SpringBootWebMongo1.repo.UsuarioRepository;




@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;


    @GetMapping(value = "")
    public List<Usuario> listAll() {    	 
    	return usuarioRepository.findAll();     	
    }	
	   
    
    @RequestMapping(value = "/{id}",  method = RequestMethod.GET)
    public Usuario findById(@PathVariable String id) {    	 
    	return usuarioRepository.findOne(id);     	
    }	
	       
    
    @RequestMapping(value = "/{id}",  method = RequestMethod.POST)
    public Usuario updateById(@PathVariable String id, @RequestBody Usuario usuario) {    	 
    	return usuarioRepository.save(usuario);   	
    }	    
    
    @RequestMapping(value = "/{id}",  method = RequestMethod.PUT)
    public Usuario setById(@PathVariable String id, @RequestBody Usuario usuario) {    	 
    	return usuarioRepository.save(usuario);   	
    }	    
    
}
