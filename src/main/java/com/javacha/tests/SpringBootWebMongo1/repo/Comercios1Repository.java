package com.javacha.tests.SpringBootWebMongo1.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javacha.tests.SpringBootWebMongo1.beans.Comercio1;

public interface Comercios1Repository  extends MongoRepository<Comercio1, String> {

		//public List<Comercio> findAll();
		
		/*
		public Page<Descod> findAllByTabla(Integer tabla, Pageable pageable);

		public Descod findByTablaAndCodigo(Integer tabla, Integer codigo);
	
		
		@Query("{ 'tabla' : ?0, 'descripcion':{$regex:?1,$options:'i'} }") 
		List<Descod> findByTablaAndDescripcion(Integer tabla, String descripcion);
		*/
					
}
