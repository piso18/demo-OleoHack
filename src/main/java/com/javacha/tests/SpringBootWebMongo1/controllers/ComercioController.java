package com.javacha.tests.SpringBootWebMongo1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacha.tests.SpringBootWebMongo1.Services.ComercioService;
import com.javacha.tests.SpringBootWebMongo1.beans.Comercio;




@RestController
@RequestMapping("/comercios")
public class ComercioController {
	
	@Autowired
	ComercioService comercioService;
	
	
    @GetMapping(value = "")
    public List<Comercio> listAll() {
    	
    	return comercioService.findAll(); 
    }	
	   
    
}
