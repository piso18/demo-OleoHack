package com.javacha.tests.SpringBootWebMongo1.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javacha.tests.SpringBootWebMongo1.beans.Comentario;
import com.javacha.tests.SpringBootWebMongo1.beans.Comercio;
import com.javacha.tests.SpringBootWebMongo1.repo.ComentarioRepository;
import com.javacha.tests.SpringBootWebMongo1.repo.ComercioRepository;

@Component
public class ComercioService {

	@Autowired
	ComercioRepository comercioRepository;

	@Autowired
	ComentarioRepository comentarioRepository;

	public List<Comercio> findAll(){
		return comercioRepository.findAll();
	}

	public Comercio findOne(String id) {
		return comercioRepository.findOne(id);
	}

	public List<Comentario> findComentariosByComercioId(String idComercio) {
		return comentarioRepository.findAllByComercioId(idComercio);
	}


	
	
}
