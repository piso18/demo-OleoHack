package com.javacha.tests.SpringBootWebMongo1.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javacha.tests.SpringBootWebMongo1.beans.Comentario;

public interface ComentarioRepository  extends MongoRepository<Comentario, String> {

	
}
