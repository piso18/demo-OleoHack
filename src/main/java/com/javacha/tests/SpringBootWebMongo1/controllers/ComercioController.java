package com.javacha.tests.SpringBootWebMongo1.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacha.tests.SpringBootWebMongo1.beans.Comentario;
import com.javacha.tests.SpringBootWebMongo1.beans.Comercio;
import com.javacha.tests.SpringBootWebMongo1.beans.Contacto;
import com.javacha.tests.SpringBootWebMongo1.repo.ComerciosRepository;




@RestController
@RequestMapping("/comercios")
public class ComercioController {

	
	@Autowired
	ComerciosRepository comercioRepository;
	

    @GetMapping(value = "")
    public List<Comercio> listAll() {
    	
    	//return comercioRepository.findAll(); 
    	
    	Comercio one = new Comercio();
    	one.setDireccion("allende 22");
    	one.setEmail("enzo@urug.com");
    	one.setId("54sc4h4j465g54");
    	one.setComercio("que rico!");
    	
    	Contacto c1 = new Contacto();
    	c1.setEmail("coco@urug.com");
    	c1.setNombre("coco");
    	c1.setTelefono("4567-5910");
    	List<Contacto> lc = new ArrayList<Contacto>();
    	lc.add(c1);
    	    	
    	one.setContactos(lc);
    	one.setPuntaje(5);
    	String c[] = new String[]{"china", "parrila"};
    	one.setCategorias( Arrays.asList(c) );
    	
    	Comentario cm1 = new Comentario();
    	cm1.setComentario("fravvfgh k  asfkfsdhk   hassdfa hk hk sdf");
    	cm1.setFechaVisita(new Date());
    	cm1.setGasto(750.44);
    	cm1.setPuntaje(3);
    	List<Comentario> lcm = new ArrayList<Comentario>();
    	lcm.add(cm1);    	
    	one.setComentarios(lcm);
    	
    	List<Comercio> ret = new ArrayList<Comercio>();
    	ret.add(one);
    	return ret;
        
    }	
	    
}
