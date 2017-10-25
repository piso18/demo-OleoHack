package com.javacha.tests.SpringBootWebMongo1.beans;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class Comentario {

	private String comentario;
	
	private double gasto;	
	
	@DateTimeFormat(iso=ISO.DATE)	
	private Date fechaVisita;
	
	private int puntaje;
	
	
	
	
	
	
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
