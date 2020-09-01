package com.serisPelis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.serisPelis.model.Serie;
import com.serisPelis.repository.SerieRepository;

@Transactional
@Service
public class SerieService {

	@Autowired
	private SerieRepository serieRepository;

	public void guardar(Serie serie) {
		serieRepository.save(serie);
	}

	public Page<Serie> buscarTodos(int page) {
		return serieRepository.findAll(PageRequest.of(page, 6));
	}

	public Serie buscarId(long id) {
		return serieRepository.findById(id).get();
	}
	
}
