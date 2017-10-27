package com.javacha.tests.SpringBootWebMongo1.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javacha.tests.SpringBootWebMongo1.beans.Usuario;

public interface UsuarioRepository  extends MongoRepository<Usuario	, String> {

	
}
