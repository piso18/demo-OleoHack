package com.javacha.tests.SpringBootWebMongo1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacha.tests.SpringBootWebMongo1.beans.Comercio;
import com.javacha.tests.SpringBootWebMongo1.repo.ComerciosRepository;




@RestController
@RequestMapping("/comercios")
public class ComercioController {

	
	@Autowired
	ComerciosRepository comercioRepository;


    @GetMapping(value = "")
    public List<Comercio> listAll() {
    	return comercioRepository.findAll();     
    }	
	   
    
}
