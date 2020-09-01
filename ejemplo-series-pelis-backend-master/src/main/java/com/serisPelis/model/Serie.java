package com.serisPelis.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.engine.jdbc.SerializableBlobProxy;

@Entity
public class Serie implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	@NotNull
	private String titulo;
	@NotNull
	private String categorias;
	@NotNull
	@Lob
    @Type(type = "text")
	private String portada;
	@NotNull
	private String clasificacion;
	@NotNull
	private String directores;
	
	public Serie() {};
	
	public Serie(String titulo, String categorias, String portada, String clasificacion) {
		this.categorias = categorias;
		this.clasificacion = clasificacion;
		this.titulo = titulo;
		this.portada = portada;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategorias() {
		return categorias;
	}

	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}

	public String getPortada() {
		return portada;
	}

	public void setPortada(String portada) {
		this.portada = portada;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public void setDirectores(String directores) {
		this.directores = directores;		
	}
	
	public String getDirectores() {
		return this.directores;
	}
}
