package com.serisPelis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serisPelis.model.Pelicula;
import com.serisPelis.service.PeliculaService;


@RestController
@RequestMapping("/series-pelis")
public class PeliculaController {
	
	@Autowired
	PeliculaService peliService;

    @CrossOrigin
    @PostMapping("/peliculas")
    public void create(@RequestBody Pelicula peli) {
        peliService.guardar(peli);
    }

    @CrossOrigin
    @GetMapping("/peliculas/{page}")	
    public Page<Pelicula> findAll(@PathVariable int page) {
    	return peliService.buscarTodos(page);
    }
    
    @CrossOrigin
    @GetMapping("/pelicula/{id}")
    public Pelicula findId(@PathVariable Integer id) {
    	return peliService.buscarId(id);
    }
}
