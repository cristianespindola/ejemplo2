package com.serisPelis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serisPelis.model.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer>{

}
