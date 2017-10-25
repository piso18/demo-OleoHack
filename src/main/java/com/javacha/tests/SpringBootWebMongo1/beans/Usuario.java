package com.javacha.tests.SpringBootWebMongo1.beans;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Document(collection="usuarios")
public class Usuario {

	@Id
	private String id;	
	
	private String nombre;
	
	@DateTimeFormat(iso=ISO.DATE)	
	private Date fechaNacimiento;
	
	private String email;
	
	private String alias;
	
	private int puntos;
	
	private int nivelInfluencer;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getNivelInfluencer() {
		return nivelInfluencer;
	}

	public void setNivelInfluencer(int nivelInfluencer) {
		this.nivelInfluencer = nivelInfluencer;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", email=");
		builder.append(email);
		builder.append(", alias=");
		builder.append(alias);
		builder.append(", puntos=");
		builder.append(puntos);
		builder.append(", nivelInfluencer=");
		builder.append(nivelInfluencer);
		builder.append("]");
		return builder.toString();
	}

	
	
		
}
