package com.serisPelis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.serisPelis.model.Pelicula;
import com.serisPelis.repository.PeliculaRepository;

@Transactional
@Service
public class PeliculaService {

	@Autowired
	private PeliculaRepository peliRepository;

	public void guardar(Pelicula peli) {
		/*String video = adaptarLinkYT(peli.getLinkYT());
		peli.setLinkYT(video);
	*/	peliRepository.save(peli);
	}

	private String adaptarLinkYT(String linkYT) {
		String link = linkYT;
		String pathVideo = link.substring(32);
		return "https://www.youtube.com/embed/" + pathVideo;
	}

	public Page<Pelicula> buscarTodos(int page) {
		return peliRepository.findAll(PageRequest.of(page, 6));
	}

	public Pelicula buscarId(Integer id) {
		return peliRepository.findById(id).get();
	}
}
