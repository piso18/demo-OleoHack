package com.javacha.tests.SpringBootWebMongo1.beans;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Document(collection="comentarios")
public class Comentario {

	
	@Id
	private String id;
	
	private String comentario;
	
	private double gasto;	
	
	@DateTimeFormat(iso=ISO.DATE)	
	private Date fechaVisita;
	
	private int puntaje;
	
	
	private String comercioId;
	
	private String usuarioId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public double getGasto() {
		return gasto;
	}

	public void setGasto(double gasto) {
		this.gasto = gasto;
	}

	public Date getFechaVisita() {
		return fechaVisita;
	}

	public void setFechaVisita(Date fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public String getComercioId() {
		return comercioId;
	}

	public void setComercioId(String comercioId) {
		this.comercioId = comercioId;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comentario [id=");
		builder.append(id);
		builder.append(", comentario=");
		builder.append(comentario);
		builder.append(", gasto=");
		builder.append(gasto);
		builder.append(", fechaVisita=");
		builder.append(fechaVisita);
		builder.append(", puntaje=");
		builder.append(puntaje);
		builder.append(", comercioId=");
		builder.append(comercioId);
		builder.append(", usuarioId=");
		builder.append(usuarioId);
		builder.append(", getId()=");
		builder.append(getId());
		builder.append(", getComentario()=");
		builder.append(getComentario());
		builder.append(", getGasto()=");
		builder.append(getGasto());
		builder.append(", getFechaVisita()=");
		builder.append(getFechaVisita());
		builder.append(", getPuntaje()=");
		builder.append(getPuntaje());
		builder.append(", getComercioId()=");
		builder.append(getComercioId());
		builder.append(", getUsuarioId()=");
		builder.append(getUsuarioId());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
		
}
