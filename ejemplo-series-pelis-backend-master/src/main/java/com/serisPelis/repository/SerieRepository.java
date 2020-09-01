package com.serisPelis.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;

import com.serisPelis.model.Serie;

public interface SerieRepository extends JpaRepository<Serie, Long>{

	Optional<Serie> findById(int id);

}
