package com.serisPelis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serisPelis.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long>{

}
