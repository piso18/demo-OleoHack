package com.javacha.tests.SpringBootWebMongo1.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javacha.tests.SpringBootWebMongo1.beans.Comercio;
import com.javacha.tests.SpringBootWebMongo1.repo.ComerciosRepository;

@Component
public class ComercioService {

	@Autowired
	ComerciosRepository comercioRepository;


	public List<Comercio> findAll(){
		return comercioRepository.findAll();
	}
	
	
}
