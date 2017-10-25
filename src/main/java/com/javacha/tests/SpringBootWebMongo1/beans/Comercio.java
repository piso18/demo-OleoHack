package com.javacha.tests.SpringBootWebMongo1.beans;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="comercios")
public class Comercio {

	@Id
	private String id;
	
	private String comercio;
	private String direccion;
	private String email;
	private List<Contacto> contactos;
	private int puntaje;
	private List<String> categorias;
	private Date fechaAlta;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComercio() {
		return comercio;
	}
	public void setComercio(String comercio) {
		this.comercio = comercio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	public List<String> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<String> categorias) {
		this.categorias = categorias;
	}

	
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comercio [id=");
		builder.append(id);
		builder.append(", comercio=");
		builder.append(comercio);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", email=");
		builder.append(email);
		builder.append(", contactos=");
		builder.append(contactos);
		builder.append(", puntaje=");
		builder.append(puntaje);
		builder.append(", categorias=");
		builder.append(categorias);
		builder.append(", fechaAlta=");
		builder.append(fechaAlta);
		builder.append("]");
		return builder.toString();
	}
	
	
	
		
}
