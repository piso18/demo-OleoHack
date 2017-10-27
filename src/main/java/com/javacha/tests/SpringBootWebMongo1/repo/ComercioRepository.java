package com.javacha.tests.SpringBootWebMongo1.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javacha.tests.SpringBootWebMongo1.beans.Comercio;

public interface ComercioRepository extends MongoRepository<Comercio, String> {

					
}
