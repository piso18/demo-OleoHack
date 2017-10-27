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
	
	public void setComercio(String comercioId) {
		this.comercioId = comercioId;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Comentario [comentario=");
		builder.append(comentario);
		builder.append(", gasto=");
		builder.append(gasto);
		builder.append(", fechaVisita=");
		builder.append(fechaVisita);
		builder.append(", puntaje=");
		builder.append(puntaje);
		builder.append("]");
		return builder.toString();
	}
	
	
	

		
}
