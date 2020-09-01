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

import com.serisPelis.model.Serie;
import com.serisPelis.service.SerieService;

@RestController
@RequestMapping("/series-pelis")
public class SerieController {
	
	@Autowired
	SerieService serieService;

    @CrossOrigin
    @PostMapping("/series")
    public void create(@RequestBody Serie serie) {
        serieService.guardar(serie);
    }
    
    @CrossOrigin
    @GetMapping("/series/{page}/")
    public Page<Serie> findAll(@PathVariable int page) {
    	return serieService.buscarTodos(page);
    }

    @CrossOrigin
    @GetMapping("/series/{id}")
    public Serie findId(@PathVariable long id) {
    	return serieService.buscarId(id);
    }
}
