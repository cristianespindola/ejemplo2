package com.serisPelis.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import lombok.Getter;
import lombok.Setter;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Pelicula implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	@NotNull
	private String titulo;
	@NotNull
	private String categorias;
	@NotNull
	@Lob
    @Type(type = "text")
	private String portada;
	@NotNull
	private String linkYT;
	@NotNull
	private String clasificacion;
	@NotNull
	private String directores;
	@NotNull
	private String actores;
	@NotNull
	private LocalDate fechaDeEstreno;
	
	public Pelicula() {};
	
	public Pelicula(String titulo, String categorias, String portada, String linkYT, String clasificacion, String actores, String directores, LocalDate fecha) {
		this.categorias = categorias;
		this.linkYT = linkYT;
		this.titulo = titulo;
		this.portada = portada;
		this.actores = actores;
		this.directores = directores;
		this.clasificacion = clasificacion;
		this.fechaDeEstreno = fecha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getLinkYT() {
		return linkYT;
	}

	public void setLinkYT(String linkYT) {
		this.linkYT = linkYT;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;		
	}

	public String getDirectores() {
		return directores;
	}

	public void setDirectores(String directores) {
		this.directores = directores;
	}

	public String getActores() {
		return actores;
	}

	public void setActores(String actores) {
		this.actores = actores;
	}

	public LocalDate getFechaDeEstreno() {
		return fechaDeEstreno;
	}

	public void setFechaDeEstreno(LocalDate fechaDeEstreno) {
		this.fechaDeEstreno = fechaDeEstreno;
	}

	public String getClasificacion() {
		return clasificacion;
	}
}
