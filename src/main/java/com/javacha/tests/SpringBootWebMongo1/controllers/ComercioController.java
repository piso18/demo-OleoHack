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
    	/*
    	Comercio comm = dummyComercio();
    	List<Comercio> ret = new ArrayList<Comercio>();
    	ret.add(comm);
    	return ret;
    	*/
        
    }	
	   
    
    /*
    private Comercio dummyComercio() {

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

    	return one;    	    	
    }
    */
}
