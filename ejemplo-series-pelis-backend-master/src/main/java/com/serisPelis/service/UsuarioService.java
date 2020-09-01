package com.serisPelis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.serisPelis.model.Usuario;
import com.serisPelis.repository.UserRepository;

@Transactional
@Service
public class UsuarioService {

	@Autowired
	UserRepository userRepo;
	
	public void guardar(Usuario user) {
		userRepo.save(user);
	}

	public List<Usuario> todos() {
		return userRepo.findAll();
	}
	
	

}
