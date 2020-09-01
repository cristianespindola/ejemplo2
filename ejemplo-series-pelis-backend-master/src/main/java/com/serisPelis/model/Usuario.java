package com.serisPelis.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	private String nombre;
	private String email;
	private long idRef;
	
	public Usuario() {}
	
	public Usuario(long id, String nombre, String email, long idRef) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.idRef = idRef;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getIdRef() {
		return idRef;
	}

	public void setIdRef(long idRef) {
		this.idRef = idRef;
	}
	
	
}
