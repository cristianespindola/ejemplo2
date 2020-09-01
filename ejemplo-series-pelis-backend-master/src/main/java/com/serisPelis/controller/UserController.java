package com.serisPelis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serisPelis.model.Usuario;
import com.serisPelis.service.UsuarioService;

@RestController
@RequestMapping("/series-pelis")
public class UserController {

	@Autowired
	UsuarioService userService;
	
	@CrossOrigin
    @PostMapping("/user")
	public void create(@RequestBody Usuario user) {
		userService.guardar(user);
	}
	
	@CrossOrigin
    @GetMapping("/users")
	public List<Usuario> findAll() {
		return userService.todos();
	}
}
