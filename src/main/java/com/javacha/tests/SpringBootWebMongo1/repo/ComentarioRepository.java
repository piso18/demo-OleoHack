package com.javacha.tests.SpringBootWebMongo1.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javacha.tests.SpringBootWebMongo1.beans.Comentario;
import com.javacha.tests.SpringBootWebMongo1.beans.Comercio;

public interface ComentarioRepository extends MongoRepository<Comentario, String>{
	
	List<Comentario> findAllByComercioId(String comercioId);

	Comercio findComercioById(String id);

}
